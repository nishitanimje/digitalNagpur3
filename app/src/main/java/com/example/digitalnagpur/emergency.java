package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
    }

    public void backarr2(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));

    }
    public void backarr(View view) {

        super.onBackPressed();
        finish();
    }
}