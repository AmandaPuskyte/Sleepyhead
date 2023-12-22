package com.example.homemed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    Button bRegistruotis;
    EditText etVardas, etAmzius, etSlapyvardis, etSlaptazodis;
    TextView userLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);

        firebaseAuth = FirebaseAuth.getInstance();

        etVardas = (EditText) findViewById(R.id.etVardas);
        etAmzius = (EditText) findViewById(R.id.etAmzius);
        etSlapyvardis = (EditText) findViewById(R.id.etSlapyvardis);
        etSlaptazodis = (EditText) findViewById(R.id.etSlaptazodis);
        bRegistruotis = (Button) findViewById(R.id.bRegistruotis);
        userLogin = (TextView) findViewById(R.id.tvUserLogin);

        bRegistruotis.setOnClickListener(this);
        userLogin.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bRegistruotis:
                String name = etVardas.getText().toString();
                String username = etSlapyvardis.getText().toString();
                String password = etSlaptazodis.getText().toString();
                int age = Integer.parseInt(etAmzius.getText().toString());

                if(name.isEmpty() && password.isEmpty() && username.isEmpty() && String.valueOf(age) == null){

                    Toast.makeText(this, "Norint užsiregistruoti, visi laukai turi būti užpildyti", Toast.LENGTH_SHORT).show();
                }
                else {
                    // uploading data to the database
                    String user_name = etSlapyvardis.getText().toString().trim();
                    String user_password = etSlaptazodis.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_name, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(Register.this, "Registracija sėkminga, prašome prisijungti", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(Register.this, Login.class));
                            }else{
                                Toast.makeText(Register.this, "Registracija nesėkminga, bandykite dar kartą", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    break;
                }
            case R.id.tvUserLogin:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }

}
