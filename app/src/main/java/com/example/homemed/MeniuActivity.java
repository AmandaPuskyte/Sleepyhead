package com.example.homemed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.firebase.auth.FirebaseAuth;

public class MeniuActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    ImageButton button_ligos_radimas;
    ImageButton button_duomenys;
    ImageButton button_informacija;
    ImageButton meniuAtsijungtiButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);
        button_ligos_radimas = (ImageButton) findViewById(R.id.button_ligos_radimas);
        button_duomenys = (ImageButton) findViewById(R.id.button_duomenys);
        button_informacija = (ImageButton) findViewById(R.id.button_informacija);
        meniuAtsijungtiButton = (ImageButton) findViewById(R.id.meniuAtsijungtiButton);
        firebaseAuth = FirebaseAuth.getInstance();


        button_ligos_radimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_ligos_radimas();
            }
        });
        button_duomenys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_duomenys();
            }
        });
        button_informacija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity_informacija();
            }
        });
        meniuAtsijungtiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(MeniuActivity.this, Login.class));
            }
        });

    }
    public void openActivity_ligos_radimas() {
        Intent intent = new Intent(this, activity_ar_yra_simptomu.class);
        startActivity(intent);
    }
    public void openActivity_duomenys() {
        Intent intent = new Intent(this, UserProfile.class);
        startActivity(intent);
    }
    public void openActivity_informacija() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://homemedifs8.wordpress.com/"));
        startActivity(intent);
    }
    public void openloginActivity(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}
