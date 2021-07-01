package com.example.digitalnagpur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    public void radisson(View view) {
        gotoUrl("https://www.radissonhotels.com/en-us/hotels/radisson-blu-nagpur");
    }

    private void gotoUrl(String s) {

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void tuli(View view) {
        gotoUrl("http://www.tulihotels.com/tuli-imperial.html");
    }

    public void regenta(View view) {
        gotoUrl("https://www.royalorchidhotels.com/regenta-central-hotel-convention-centre-nagpur/overview");
    }



    public void onBackPressed(){
        super.onBackPressed();
    }

    public void dire(View view) {
        gotoUrl("https://www.google.com/maps/place/Radisson+Blu+Hotel+Nagpur/@21.1059361,79.0696657,15z/data=!4m8!3m7!1s0x0:0x2bd11894402740fb!5m2!4m1!1i2!8m2!3d21.1059361!4d79.0696657");
    }

    public void dire12(View view) {

        gotoUrl("https://www.google.com/maps/place/Tuli+Imperial/@21.1337441,79.073017,15z/data=!4m8!3m7!1s0x0:0xa46406ec8a4e6cdc!5m2!4m1!1i2!8m2!3d21.1337441!4d79.073017");
    }

    public void directi(View view) {
        gotoUrl("https://www.google.com/maps/place/Regenta+Central+Hotel+%26+Convention+Centre/@21.1411392,79.1198001,15z/data=!4m8!3m7!1s0x0:0x43057e4cb0eb6be5!5m2!4m1!1i2!8m2!3d21.1411392!4d79.1198001");
    }

    public void backar(View view) {

        startActivity(new Intent(getApplicationContext(),homepagen.class));
    }
}