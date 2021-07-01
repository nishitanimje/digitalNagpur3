package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;


public class Cases extends AppCompatActivity {
    // ArrayList for person names, email Id's and mobile numbers

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);


    }

    @Override
    public void onBackPressed(){

        super.onBackPressed();
        finish();

    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void cases(View view) {
        gotoUrl("https://news.google.com/covid19/map?hl=en-IN&gl=IN&ceid=IN%3Aen&mid=%2Fm%2F03rk0");
    }

    public void vaccine(View view) {
        gotoUrl("https://selfregistration.cowin.gov.in/");
    }

    public void web(View view) {
        gotoUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019?gclid=Cj0KCQjwna2FBhDPARIsACAEc_VKyIcQ7YKeppWS_8st4_x66NrKYqNQY_SJ26lN6WrocyKTad0exc0aAmsNEALw_wcB");
    }

    public void vaccination(View view) {
        gotoUrl("https://play.google.com/store/apps/details?id=nic.goi.aarogyasetu");
    }
}


