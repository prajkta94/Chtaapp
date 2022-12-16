package com.paymentz.chtaapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.paymentz.chtaapp.R;
import com.paymentz.chtaapp.databinding.ActivitySignInActivityBinding;

import java.util.HashMap;

public class SignInActivity extends AppCompatActivity {
    private ActivitySignInActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setListener();
        binding.btnSignIn.setOnClickListener(view -> {
            addDataFireStoarge();
        });

    }

    private void setListener(){
        binding.textCreateNewAccount.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(),SignUp.class)));
    }

    private  void addDataFireStoarge(){
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        HashMap<String,Object> data = new HashMap<>();
        data.put("first_name","Chirag");
        data.put("last_name","Janvalkar");
        firebaseFirestore.collection("users")
                .add(data)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(SignInActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();

                })
                .addOnFailureListener(exception ->{
                    Toast.makeText(SignInActivity.this, exception.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                });



    }

    private void show_Message(){

    }
}