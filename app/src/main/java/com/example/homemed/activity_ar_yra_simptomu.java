package com.example.homemed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_ar_yra_simptomu extends AppCompatActivity {

    private Button Yra;
    private Button buttonNe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_yra_simptomu);
        Yra = (Button) findViewById(R.id.B_yra);
        buttonNe = (Button) findViewById(R.id.Button_nera);
        
        Yra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_ar_yra_simptomu.this, Simptomu_ivedimas.class);
                startActivity(intent);
            }
        });
        buttonNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNera();
            }
        });

    }
    public void openActivityNera(){
            Toast.makeText(activity_ar_yra_simptomu.this, "Atsiprašome, bet ligos nustatyti nepavyks", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MeniuActivity.class);
            startActivity(intent);
    }
}
