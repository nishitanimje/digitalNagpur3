package com.example.digitalnagpur;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    EditText memail ;
    EditText mpassword;
    Button mlogin;
    FirebaseAuth mfirebaseauth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mfirebaseauth = FirebaseAuth.getInstance();
        memail = findViewById(R.id.email);
        mpassword = findViewById(R.id.password);
        mlogin = findViewById(R.id.logbtn);




        if (mfirebaseauth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), homepagen.class));
            finish();
        }



    }
    public void logbtn(View view) {
        String email = memail.getText().toString().trim();
        String password = mpassword.getText().toString().trim();
        mfirebaseauth= FirebaseAuth.getInstance();
        if (TextUtils.isEmpty(email)) {
            memail.setError("Email is Required");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mpassword.setError("Password is required");
            return;
        }
        if (password.length() < 6) {
            mpassword.setError("Password must be 6 character long");
            return;
        }
        mfirebaseauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(login.this, "Login SuccessFull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, homepagen.class));
                    finish();
                } else {
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    public void newUser(View view) {
        startActivity(new Intent(login.this,MainActivity.class));
    }


    /*google login*/


    }




