package com.example.homemed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SutrikimaiActivity extends AppCompatActivity {
private Button ivesti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sutrikimai);
        ivesti = (Button) findViewById(R.id.button_ivesti);

        ivesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityIvesti();

            }
        });
    }
    public void openActivityIvesti() {
        Intent intent = new Intent(this, Duomenu_isvedimasActivity.class);
        startActivity(intent);
    }
}
