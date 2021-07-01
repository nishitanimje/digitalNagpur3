package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }
    public void onBackPressed(){

        super.onBackPressed();

    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));
        finish();
    }

    public void hs1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Big-Bazaar-Near-Panchasheel-Square-Ramdas-Peth/0712P712STD200015_BZDET");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void cs1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Cinemax-Cinemas-Eternity-Mall-Near-Variety-Square-Sitabuldi/0712PX712-X712-1233227753M4D1I6-DC_BZDET");
    }

    public void gi1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Fortune-Mall-Near-Bank-Of-Maharashtra-Sitabuldi/0712PX712-X712-180519195006-T6J7_BZDET");
    }

    public void emp(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Empress-Mall-Cotton-Market/0712P7104-7104-101020155218-V5I8_BZDET");
    }

    public void d4(View view) {
        gotoUrl("https://www.google.com/maps/place/Empress+Mall/@21.1479681,79.093587,15z/data=!4m5!3m4!1s0x0:0x60cf5809c461d502!8m2!3d21.1479681!4d79.093587");
    }

    public void d2(View view) {
        gotoUrl("https://www.google.com/maps/place/PVR+Eternity+Mall,+Nagpur/@21.14323,79.080348,15z/data=!4m5!3m4!1s0x0:0x21900b615c243eed!8m2!3d21.14323!4d79.080348");
    }

    public void d3(View view) {
        gotoUrl("https://www.google.com/maps/place/Fortune+Mall/@21.1408057,79.0820734,15z/data=!4m5!3m4!1s0x0:0x242c32ec3cb1fbee!8m2!3d21.1408057!4d79.0820734");
    }


    public void d1(View view) {
        gotoUrl("https://www.google.com/maps/place/FBB-FASHION+AT+BIG+BAZAAR/@21.1380588,79.078983,15z/data=!4m5!3m4!1s0x0:0x4157eb9a0415084d!8m2!3d21.1380588!4d79.078983");
    }
}