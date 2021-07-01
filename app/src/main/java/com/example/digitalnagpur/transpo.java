package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class transpo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpo);




    }

    public void backarr(View view) {

        startActivity(new Intent(getApplicationContext(),homepagen.class));

    }
    public void onBackPressed(){
        /*  Intent intent = new Intent(transpo.this,homepagen.class);*/
        super.onBackPressed();


    }

    public void metro(View view) {
        gotoUrl("https://www.metrorailnagpur.com/");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void cab(View view) {
    gotoUrl("https://www.olacabs.com/");}


    public void airport(View view) {
        gotoUrl("https://www.nagpurairport.com/");
    }

    public void train(View view) {
        gotoUrl("https://enquiry.indianrail.gov.in/ntes/index.html");
    }
}