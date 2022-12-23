package com.paymentz.chtaapp.activity;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.paymentz.chtaapp.R;
import com.paymentz.chtaapp.Utilies.Constant;
import com.paymentz.chtaapp.Utilies.PreferenceManger;
import com.paymentz.chtaapp.databinding.ActivitySignUpBinding;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    String encodeImage;
    private PreferenceManger preferenceManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferenceManger = new PreferenceManger(getApplicationContext());

        setListeners();
    }

    private void  setListeners(){
        binding.textCreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        binding.btnSignUP.setOnClickListener(view -> {
            if(isVisibleSignUpDetails()){
                signUp();
            }
        });

        binding.layoutImage.setOnClickListener(view -> {
            Intent intent= new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.addFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
            pickImage.launch(intent);
        });

    }


    private void show_Toast(String message){
        Toast.makeText(SignUp.this, message, Toast.LENGTH_SHORT).show();
    }

    private void signUp(){
        loading(true);
        FirebaseFirestore databaseUser = FirebaseFirestore.getInstance();
        HashMap<String,Object> user = new HashMap<>();
        user.put(Constant.KEY_NAME,binding.edtName.getText().toString());
        user.put(Constant.KEY_EMAIL,binding.edtEmail.getText().toString());
        user.put(Constant.KEY_IMAGE,encodeImage);
        databaseUser.collection
        (Constant.KEY_COLLECTION_USERS).add(user).
                addOnSuccessListener(documentReference -> {
                    loading(false);

                    preferenceManger.putBoolean(Constant.KEY_SIGNED_IN,true);
                    preferenceManger.putString(Constant.KEY_USER_ID,documentReference.getId());
                    preferenceManger.putString(Constant.KEY_NAME,binding.edtName.getText().toString());
                    preferenceManger.putString(Constant.KEY_IMAGE,encodeImage);
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                })
                .addOnFailureListener(exception ->{

                    loading(false);
                    show_Toast(exception.getMessage());
                });

    }

    private String encodeImage(Bitmap bitmap){
        int previewWidth=150;
        int previewHeight=bitmap.getHeight() * previewWidth / bitmap.getWidth();
        Bitmap previewBitmap=Bitmap.createScaledBitmap(bitmap,previewWidth,previewHeight,false);
        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
        previewBitmap.compress(Bitmap.CompressFormat.JPEG,50,byteArrayOutputStream);
        byte[] bytes=byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(bytes,Base64.DEFAULT);
    }

    private final ActivityResultLauncher<Intent> pickImage= registerForActivityResult
            (new ActivityResultContracts.StartActivityForResult(),
            result -> {
        if(result.getResultCode() == RESULT_OK){
            Uri imageUri= result.getData().getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(imageUri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                binding.imgImagProfile.setImageBitmap(bitmap);
                binding.txtAddImage.setVisibility(View.GONE);
                encodeImage= encodeImage(bitmap);
            }catch (FileNotFoundException e){
                e.getLocalizedMessage();
            }
        }
            });

    private  Boolean isVisibleSignUpDetails() {
        if (encodeImage == null) {
            show_Toast("select profile Image");
            return false;
        } else if (binding.edtName.getText().toString().trim().isEmpty()) {
            show_Toast("Enter Name");
            return false;
        } else if (binding.edtEmail.getText().toString().trim().isEmpty()) {
            show_Toast("Enter Email");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.edtEmail.getText().toString()).matches()) {
            show_Toast("Enter Valid email");
            return false;
        } else if (binding.edtPassword.getText().toString().trim().isEmpty()) {
            show_Toast("Enter Password");
            return false;
        } else if (binding.edtConformpassword.getText().toString().trim().isEmpty()) {
            show_Toast("Conform your password");
            return false;
        } else if (!binding.edtPassword.getText().toString().equals(binding.edtConformpassword.getText().toString())) {
            show_Toast("password and conform password must be same");
            return false;
        }else{
            return true;
        }

    }

    private void loading(Boolean isLoading){
        if(isLoading){
            binding.btnSignUP.setVisibility(View.INVISIBLE);
            binding.progressBar.setVisibility(View.VISIBLE);
        }else{
            binding.btnSignUP.setVisibility(View.VISIBLE);
            binding.progressBar.setVisibility(View.INVISIBLE);

        }

    }

}