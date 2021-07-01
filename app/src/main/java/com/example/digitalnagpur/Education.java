package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Education extends AppCompatActivity {

 TextView textview;
 TextView textView2;
 TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        textview = findViewById(R.id.but1);
       /* textview.setPaintFlags(textview.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);*/
        textview.setMovementMethod(LinkMovementMethod.getInstance());

        textView2 = findViewById(R.id.butt1);
        /*textView2.setPaintFlags(textView2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);*/
        textView2.setMovementMethod(LinkMovementMethod.getInstance());


        textView3 = findViewById(R.id.butt2);
       /* textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);*/
        textView3.setMovementMethod(LinkMovementMethod.getInstance());




    }


    @Override
    public void onBackPressed(){

        super.onBackPressed();
        finish();

    }

    public void backarrow(View view) {
        startActivity(new Intent(getApplicationContext(),homepagen.class));
    }


    public void gi1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/ST-Ursula-Girls-High-School-Opposite-Vca-Ground-Civil-Lines/0712PX712-X712-110329113726-C3D5_BZDET");
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void cs1(View view) {
        gotoUrl("https://www.cbseschool.org/bishop-cotton-school-nagpur-maharashtra/");
    }

    public void hs1(View view) {
        gotoUrl("https://www.justdial.com/Nagpur/St-Xaviers-High-School-Hiwri-Nagar-Bagadganj/0712P712STD121_BZDET");
    }

    public void dire(View view) {
        gotoUrl("https://www.google.com/maps/place/St.+Xavier%E2%80%99s+High+School/@21.1400801,79.1353516,15z/data=!4m5!3m4!1s0x0:0x54b9db3ed137c1ad!8m2!3d21.1400801!4d79.1353516");
    }

    public void direc(View view) {
        gotoUrl("https://www.google.com/maps/place/St.+Xavier%E2%80%99s+High+School/@21.1400801,79.1353516,15z/data=!4m5!3m4!1s0x0:0x54b9db3ed137c1ad!8m2!3d21.1400801!4d79.1353516");
    }

    public void direct(View view) {
        gotoUrl("https://www.google.com/maps/place/Bishop+Cotton+School/@21.1568532,79.0795185,15z/data=!4m5!3m4!1s0x0:0xace8e90597d450e1!8m2!3d21.1568532!4d79.0795185");
    }
}