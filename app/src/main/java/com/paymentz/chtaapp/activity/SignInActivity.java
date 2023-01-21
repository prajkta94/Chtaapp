package com.paymentz.chtaapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.paymentz.chtaapp.R;
import com.paymentz.chtaapp.Utilies.PreferenceManger;
import com.paymentz.chtaapp.databinding.ActivitySignInActivityBinding;

import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {
    private ActivitySignInActivityBinding binding;
    ProgressBar progressBar;
    PreferenceManger preferenceManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        preferenceManger=new PreferenceManger(getApplicationContext());
        setListener();
        binding.btnSignIn.setOnClickListener(view -> {
//            addDataFireStoarge();
        });

    }

    private void setListener(){
        binding.textCreateNewAccount.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(),SignUp.class)));

        binding.btnSignIn.setOnClickListener(view -> {
            if(isVisible()){
                signIn_Method();
            }
        });
    }

//    private  void addDataFireStoarge(){
//        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
//        HashMap<String,Object> data = new HashMap<>();
//        data.put("first_name","Chirag");
//        data.put("last_name","Janvalkar");
//        firebaseFirestore.collection("users")
//                .add(data)
//                .addOnSuccessListener(documentReference -> {
//                    Toast.makeText(SignInActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
//
//                })
//                .addOnFailureListener(exception ->{
//                    Toast.makeText(SignInActivity.this, exception.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//                });
//
//
//
//    }

    private void show_Message(String message){

        Toast.makeText(SignInActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    private void signIn_Method(){
       loading(true);
       FirebaseFirestore firebaseFirestore= FirebaseFirestore.getInstance();


    }


    private boolean isVisible(){
        if(binding.edtEmail.getText().toString().trim().isEmpty()){
            show_Message("Enter email");
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(binding.edtEmail.getText().toString()).matches()){
            show_Message("Enter valid Email");
            return false;
        }
        else if(binding.edtPassword.getText().toString().trim().isEmpty()){
            show_Message("Enter Password");
            return false;

        }else{
            return true;
        }

    }

    private void loading(Boolean isLoading){
        if(isLoading){
            binding.btnSignIn.setVisibility(View.INVISIBLE);
            binding.progressBar.setVisibility(View.VISIBLE);
        }else{
            binding.btnSignIn.setVisibility(View.VISIBLE);
            binding.progressBar.setVisibility(View.INVISIBLE);

        }

    }

}