package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void panino(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Panino-The-Sandwich-World-Opposite-Poonam-Mall-Near-Big-Bazar-Uday-Nagar-Padole-Wardhaman-Nagar/0712P7104-7104-110124100728-M2E2_BZDET");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void bhotel(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Babbu-Hotel-Near-Mominpura-Square-Opposite-Islamia-School-Mominpura/0712PX712-X712-121230223320-A1J5_BZDET");
    }

    public void naved(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/Naivedhyam-Restaurant-Under-Renovation-Jhansi-Rani-Square-Near-Dhantoli-Sitabuldi/0712P712STD2000337_BZDET");
    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));

    }

    public void backarr(View view) {

        super.onBackPressed();
        finish();
    }

    public void dire(View view) {
        gotoUrl("https://www.google.com/maps/place/Panino+:+The+Sandwich+World/@21.1464966,79.1351581,15z/data=!4m5!3m4!1s0x0:0xaefadfda06ba249f!8m2!3d21.1464966!4d79.1351581");
    }

    public void direc1(View view) {
        gotoUrl("https://www.google.com/maps/place/Hotel+Babbu/@21.157356,79.096878,15z/data=!4m8!3m7!1s0x0:0xfd959200065dfa0b!5m2!4m1!1i2!8m2!3d21.157356!4d79.096878");
    }

    public void dire3(View view) {

        gotoUrl("https://www.google.com/maps/place/Naivedhyam+Restaurant/@21.1410711,79.0806787,15z/data=!4m5!3m4!1s0x0:0x6c00400b26effa49!8m2!3d21.1410711!4d79.0806787");
    }

}