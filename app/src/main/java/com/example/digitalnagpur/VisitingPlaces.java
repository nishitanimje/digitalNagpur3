package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class VisitingPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_places);
    }

    public void khindi(View view) {
        gotoUrl("https://nagpur.tourismindia.co.in/khindsi-lake-nagpur");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void dragon(View view) {
        gotoUrl("https://nagpur.tourismindia.co.in/dragon-palace-buddhist-temple-nagpur");
    }

    public void futala(View view) {
        gotoUrl("https://www.tripadvisor.in/Attraction_Review-g662323-d2009025-Reviews-Futala_Lake-Nagpur_Nagpur_District_Maharashtra.html");
    }

    public void k1(View view) {
        gotoUrl("https://www.google.com/maps/place/Ramtek+Dam+,+Spillway+and+Reservoir./@21.3979215,79.3352069,13z/data=!3m1!4b1!4m5!3m4!1s0x3bd4d337e7c0c7a1:0x54310189d8cc9849!8m2!3d21.404032!4d79.3634517");
    }

    public void dra(View view) {
        gotoUrl("https://www.google.com/maps/place/Dragon+Palace+Temple/@21.2084715,79.2031622,15z/data=!4m5!3m4!1s0x0:0x973913ed992450b5!8m2!3d21.2084715!4d79.2031622");
    }

    public void fu(View view) {
        gotoUrl("https://www.google.com/maps/place/Futala+Lake/@21.154029,79.0370159,16z/data=!3m1!4b1!4m5!3m4!1s0x3bd4c037ffc26a85:0x16dab14f423e9dcd!8m2!3d21.154577!4d79.0426116");
    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));

    }
    public void onBackPressed(){

        super.onBackPressed();
        finish();

    }
}