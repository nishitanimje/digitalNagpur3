package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Complain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);
    }

    public void backarr(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));
        finish();
    }
    public void onBackPressed(){

        super.onBackPressed();

    }

    public void water(View view) {
        gotoUrl("https://www.ocwindia.com/");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void electric(View view) {
        gotoUrl("https://www.mahadiscom.in/");
    }
}