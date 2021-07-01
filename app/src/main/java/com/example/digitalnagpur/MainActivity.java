package com.example.digitalnagpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {


    EditText mname,mpassword,memail;
    Button button;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mname=findViewById(R.id.textView4);
        memail=findViewById(R.id.textView2);
        mpassword=findViewById(R.id.textView3);
        button=findViewById(R.id.button);
        firebaseAuth = FirebaseAuth.getInstance();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = memail.getText().toString().trim();
                String password = mpassword.getText().toString().trim();

                firebaseAuth.getInstance().createUserWithEmailAndPassword(email,password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "user created successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),homepagen.class));
                        }
                        else {
                            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


                /*

                if (TextUtils.isEmpty(email)){
                    memail.setError("Email is required");
                          return;
                }

                if (TextUtils.isEmpty(password)){
                    mpassword.setError("password is required");
                    return;
                }
                if (password.length()<6){
                    mpassword.setError("pass must be 6 character  is required");

                } */






            }
        });



    }


}

