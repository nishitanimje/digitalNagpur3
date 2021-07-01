package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


    }
    @Override
    public void onBackPressed(){

        super.onBackPressed();
        finish();

    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));

    }

    public void sh1(View view) {
        gotoUrl("http://sevenstarhospitals.com/");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void th1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Smt-Nimbunabai-Tirpude-Hospital-Research-Centre-Kamptee-Road/0712PX712-X712-170208202534-I3Z3_BZDET");
    }

    public void ah1(View view) {
        gotoUrl("https://www.alexishospital.com/");
    }

    public void sdir1(View view) {
        gotoUrl("https://www.google.com/maps/place/Seven+Star+Hospital/@21.138992,79.1201063,15z/data=!4m5!3m4!1s0x0:0x6dad340a5c314afe!8m2!3d21.138992!4d79.1201063");

    }

    public void sdir2(View view) {

        gotoUrl("https://www.google.com/maps/place/Tirpude+Hospital/@21.1765025,79.1041596,15z/data=!4m5!3m4!1s0x0:0x2e41f760d95ab6f8!8m2!3d21.1765025!4d79.1041596");
    }

    public void sdir3(View view) {
        gotoUrl("https://www.google.com/maps/place/Alexis+Multispecialty+Hospital/@21.1857573,79.0795349,15z/data=!4m5!3m4!1s0x0:0x7fd062d82b6be17c!8m2!3d21.1857573!4d79.0795349");
    }
}