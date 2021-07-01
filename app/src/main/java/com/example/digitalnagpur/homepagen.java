package com.example.digitalnagpur;

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/*import android.widget.Toolbar;*/
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class homepagen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    FirebaseAuth mfirebaseauth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagen);


        mfirebaseauth = FirebaseAuth.getInstance();
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new
                ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.home);

    }




    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
            finishAffinity();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        int id = item.getItemId();
        switch (id){
            /*navigation drawer */
           case  R.id.home:
                Toast.makeText(this, "HomePage", Toast.LENGTH_SHORT).show();
                break;
                /*
            case  R.id.nav_login:
                Toast.makeText(this, "Login Page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(homepagen.this, login.class));
                break;  */
            case R.id.nav_abt_ngp:
                startActivity(new Intent(getApplicationContext(),about.class));
                finish();
                break;

            case  R.id.nav_logout:
                mfirebaseauth.signOut();
                startActivity(new Intent(getApplicationContext(),login.class));
                finish();
                break;
            case R.id.nav_feedback:

                showDialog();
                break;

            case R.id.event:
                startActivity(new Intent(getApplicationContext(),Events.class));
                finish();
                break;
            case R.id.nav_case:

                startActivity(new Intent(getApplicationContext(),Cases.class));
                finish();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void c1(View view) {
        startActivity(new Intent(getApplicationContext(),Education.class));
        finish();
    }

    public void c4(View view) {
        startActivity(new Intent(getApplicationContext(),hospital.class));

    }

    public void c2(View view) {

        startActivity(new Intent(getApplicationContext(),shopping.class));

    }

    public void c3(View view) {
        startActivity(new Intent(getApplicationContext(),food.class));

    }

    public void c5(View view) {

        startActivity(new Intent(getApplicationContext(),Hotel.class));

    }

    public void c6(View view) {
        startActivity(new Intent(getApplicationContext(),transpo.class));

    }

    public void c7(View view) {
        startActivity(new Intent(getApplicationContext(),VisitingPlaces.class));

    }

    public void c8(View view) {
        startActivity(new Intent(getApplicationContext(),emergency.class));


    }


    private void showDialog(){
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("FeedBack Form");
        dialog.setMessage("Provide us your valueable feedback");
        LayoutInflater inflater= LayoutInflater.from(this);
        View reg_layout = inflater.inflate(R.layout.activity_feedback,null);
        final MaterialEditText editEmail = reg_layout.findViewById(R.id.edmail);
        final MaterialEditText editName = reg_layout.findViewById(R.id.edmail2);
        final MaterialEditText editFeedback = reg_layout.findViewById(R.id.edmail3);

        dialog.setView(reg_layout);

        dialog.setPositiveButton("SEND", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (TextUtils.isEmpty(editEmail.getText().toString())){
                    Toast.makeText(homepagen.this, "Please type your email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(editName.getText().toString())){
                    Toast.makeText(homepagen.this, "Please type your name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(editFeedback.getText().toString())){
                    Toast.makeText(homepagen.this, "Please type your feedback", Toast.LENGTH_SHORT).show();

                }

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        Object value  = snapshot.getValue();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Toast.makeText(homepagen.this, "failed", Toast.LENGTH_SHORT).show();
                    }
                });

                myRef.child("Users").child(editName.getText().toString()).child("Email").setValue(editEmail.getText().toString());
                myRef.child("Users").child(editName.getText().toString()).child("Feedback").setValue(editFeedback.getText().toString());
                myRef.child("Users").child(editName.getText().toString()).child("Name").setValue(editName.getText().toString());

                Toast.makeText(homepagen.this, "Thanks for your feedback", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }



    public void c9(View view) {
        startActivity(new Intent(getApplicationContext(),Complain.class));

    }
}