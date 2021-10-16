package com.example.sleepyhead;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText disable_input, repeatable_input, minutes_input, hours_input;
    Button update_button, delete_button;

    String id, minutes, hours, disable, weekdays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        disable_input = findViewById(R.id.disable_input2);
        repeatable_input = findViewById(R.id.repeatable_input2);
        hours_input = findViewById(R.id.hours_input2);
        minutes_input = findViewById(R.id.minutes_input2);
        update_button = findViewById(R.id.update_button);
        delete_button = findViewById(R.id.delete_button);

        //First we call this
        getAndSetIntentData();

        //Set actionbar title after getAndSetIntentData method
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(weekdays);
        }

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //And only then we call this
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                disable = disable_input.getText().toString().trim();
                weekdays = repeatable_input .getText().toString().trim();
                hours = hours_input.getText().toString().trim();
                minutes = minutes_input.getText().toString().trim();
                myDB.updateData(id, weekdays, disable, hours, minutes);
            }
        });
        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmDialog();
            }
        });

    }

    void getAndSetIntentData(){
        if(getIntent().hasExtra("id")  && getIntent().hasExtra("disable") && getIntent().hasExtra("repeatable") && getIntent().hasExtra("hours") && getIntent().hasExtra("minutes")){
            //Getting Data from Intent
            id = getIntent().getStringExtra("id");
            disable = getIntent().getStringExtra("disable");
            weekdays = getIntent().getStringExtra("repeatable");
            hours = getIntent().getStringExtra("hours");
            minutes = getIntent().getStringExtra("minutes");

            //Setting Intent Data
            disable_input.setText(disable);
            repeatable_input.setText(weekdays);
            hours_input.setText(hours);
            minutes_input.setText(minutes);
            Log.d("stev", disable+""+weekdays+"  "+hours+" "+minutes);
        }else{
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + hours +":"+ minutes + " ?");
        builder.setMessage("Are you sure you want to delete " + hours +":"+ minutes +" ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(UpdateActivity.this);
                myDB.deleteOneRow(id);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }
}
