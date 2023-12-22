package com.example.homemed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ScrollView;


public class Simptomu_ivedimas extends AppCompatActivity {

    private CheckBox chec_akiu_burnos_sausumas, check_kosulys, check_skrepliavimas, check_sloga, check_vemimas, check_viduriavimas, check_viduriu_uzkietejimas, check_pilvo_putimas, check_padid_temp;
    private CheckBox check_niezulys, check_kuno_berimas, check_akiu_paraudimas, check_mieguistumas, check_pykinimas, check_kraujavimas, check_dusulys, check_apetito_pablogejimas;
    private Button ivesti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simptomu_ivedimas);
        ivesti = (Button) findViewById(R.id.button_ivesti);

        ivesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityIvesti();

            }
        });
        addListenerToCheckBox();
    }
    public void addListenerToCheckBox(){
        chec_akiu_burnos_sausumas = (CheckBox) findViewById(R.id.chec_akiu_burnos_sausumas);
        chec_akiu_burnos_sausumas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Akių ir burnos sausumas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_kosulys = (CheckBox) findViewById(R.id.check_kosulys);
        check_kosulys.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Kosulys yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_sloga = (CheckBox) findViewById(R.id.check_sloga);
        check_sloga.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Sloga yra pažymėta", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_vemimas = (CheckBox) findViewById(R.id.check_vemimas);
        check_vemimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Vėmimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_viduriavimas = (CheckBox) findViewById(R.id.check_viduriavimas);
        check_viduriavimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Viduriavimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_viduriu_uzkietejimas = (CheckBox) findViewById(R.id.check_viduriu_uzkietejimas);
        check_viduriu_uzkietejimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Vidurių užkietėjimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_pilvo_putimas = (CheckBox) findViewById(R.id.check_pilvo_putimas);
        check_pilvo_putimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Pilvo pūtimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_padid_temp = (CheckBox) findViewById(R.id.check_padid_temp);
        check_padid_temp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Padidėjusi temperatūra yra pažymėta", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_niezulys = (CheckBox) findViewById(R.id.check_niezulys);
        check_niezulys.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Niežulys yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_kuno_berimas = (CheckBox) findViewById(R.id.check_kuno_berimas);
        check_kuno_berimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Kūno bėrimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_akiu_paraudimas = (CheckBox) findViewById(R.id.check_akiu_paraudimas);
        check_akiu_paraudimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Akių paraudimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_mieguistumas = (CheckBox) findViewById(R.id.check_mieguistumas);
        check_mieguistumas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Mieguistumas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_pykinimas = (CheckBox) findViewById(R.id.check_pykinimas);
        check_pykinimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Pykinimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_kraujavimas = (CheckBox) findViewById(R.id.check_kraujavimas);
        check_kraujavimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Kraujavimas yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_dusulys = (CheckBox) findViewById(R.id.check_dusulys);
        check_dusulys.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Dusulys yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check_apetito_pablogejimas = (CheckBox) findViewById(R.id.check_bendras_silpnumas);
        check_apetito_pablogejimas.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()){
                            Toast.makeText(Simptomu_ivedimas.this, "Apetito pablogėjima yra pažymėtas", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        ivesti = (Button) findViewById(R.id.button_ivesti);


    }
    public void openActivityIvesti(){
        Intent intent = new Intent(this, Duomenu_isvedimasActivity.class);
        startActivity(intent);
    }
}
