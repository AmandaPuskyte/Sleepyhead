package com.example.sleepyhead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText displayed_input, repeatable_input, minutes_input, hours_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        displayed_input = findViewById(R.id.disable_input);
        repeatable_input = findViewById(R.id.repeatable_input);
        minutes_input = findViewById(R.id.minutes_input);
        hours_input = findViewById(R.id.hours_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addAlarm(displayed_input.getText().toString().trim(),
                        repeatable_input.getText().toString().trim(),
                        Integer.valueOf(minutes_input.getText().toString().trim()),
                        Integer.valueOf(hours_input.getText().toString().trim()));
            }
        });
    }
}
