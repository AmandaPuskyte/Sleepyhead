package com.example.homemed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity{

    Button bPrisijungimas;
    Button bPrisijungti;
    EditText etSlapyvardis, etSlaptazodis;
    TextView info;
    TextView registrLink;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisijungimas);

        etSlapyvardis = (EditText) findViewById(R.id.etSlapyvardis);
        etSlaptazodis = (EditText) findViewById(R.id.etSlaptazodis);
        bPrisijungimas = (Button)findViewById(R.id.bPrisijungti);
        registrLink = (TextView) findViewById(R.id.tvRegLinkas);
        info = (TextView) findViewById(R.id.Info);

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        FirebaseUser user = firebaseAuth.getCurrentUser();

        if(user != null){
            finish();
            startActivity(new Intent(Login.this, MeniuActivity.class));
        }

        bPrisijungimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etSlapyvardis.getText().toString(), etSlaptazodis.getText().toString());
            }
        });
        registrLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
               }
        });

    }
    private void validate(final String userName, String userPassword){
        progressDialog.setMessage("Palaukite, duomenys tikrinami...");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(userName, userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){
                  //checkEmailVerification();
                  progressDialog.dismiss();
                  Toast.makeText(Login.this, "Prisijungimas sėkmingas", Toast.LENGTH_SHORT).show();
                  startActivity(new Intent(Login.this, MeniuActivity.class));
              }
              else{
                  Toast.makeText(Login.this, "Prisijungti nepavyko, bandykite dar kartą", Toast.LENGTH_SHORT).show();
                  counter--;
                  info.setText("Liko prisijungimo bandymų: " + String.valueOf(counter));
                  progressDialog.dismiss();
                  if(counter == 0){
                      bPrisijungimas.setEnabled(false);
                      info.setText("Neliko prisijungimo bandymų.Įjunkite programėlę iš naujo");
                  }
              }
            }
        });
    }
    private void checkEmailVerification(){
        FirebaseUser firebaseUser = firebaseAuth.getInstance().getCurrentUser();
        Boolean emailflag = firebaseUser.isEmailVerified();

        if(emailflag){
            finish();
            startActivity(new Intent(Login.this, UserProfile.class));
        }else{
            Toast.makeText(this,"Elektroninis paštas turi būti patvirtintas", Toast.LENGTH_LONG).show();
            firebaseAuth.signOut();
        }
        bPrisijungti = (Button) findViewById(R.id.bPrisijungti);


        bPrisijungti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bPrisijungti) {
                openActivity_ligos_radimas();

            }
        });


    }
    public void openActivity_ligos_radimas() {
        Intent intent = new Intent(this, MeniuActivity.class);
        startActivity(intent);
    }
}
