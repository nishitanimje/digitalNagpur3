package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }
    @Override
    public void onBackPressed(){

        super.onBackPressed();
        finish();

    }
    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));
    }
}