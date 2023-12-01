package com.cursoandroid.navigationdrawer.ui.principal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import com.cursoandroid.navigationdrawer.R;
import com.cursoandroid.navigationdrawer.TelaLogin;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class Holerite extends AppCompatActivity {

    private Spinner spinner;
    private Button voltarTopo;
    private ImageView janeiro;
    private ImageView fevereiro;
    private ImageView marco;
    private ImageView abril;
    private ImageView maio;
    private ImageView junho;
    private ImageView julho;
    private ImageView agosto;
    private ImageView setembro;
    private ImageView outubro;
    private ImageView novembro;
    private ImageView dezembro;
    private int numFuncionario = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holerite);

        spinner = findViewById(R.id.spinner);
        janeiro = findViewById(R.id.janeiro);
        fevereiro = findViewById(R.id.fevereiro);
        marco = findViewById(R.id.marco);
        abril = findViewById(R.id.abril);
        maio = findViewById(R.id.maio);
        junho = findViewById(R.id.junho);
        julho = findViewById(R.id.julho);
        agosto = findViewById(R.id.agosto);
        setembro = findViewById(R.id.setembro);
        outubro = findViewById(R.id.outubro);
        novembro = findViewById(R.id.novembro);
        dezembro = findViewById(R.id.dezembro);


        String[] ano = {"2021", "2022", "2023"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, ano);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (numFuncionario == 0) {

                    switch (position) {
                        case 0:
                            janeiro.setImageResource(R.drawable.franciscojan2021);
                            fevereiro.setImageResource(R.drawable.franciscofev2021);
                            marco.setImageResource(R.drawable.franciscomar2021);
                            abril.setImageResource(R.drawable.franciscoabr2021);
                            maio.setImageResource(R.drawable.franciscomaio2021);
                            junho.setImageResource(R.drawable.franciscojun2021);
                            julho.setImageResource(R.drawable.franciscojul2021);
                            agosto.setImageResource(R.drawable.franciscoago2021);
                            setembro.setImageResource(R.drawable.franciscoset2021);
                            outubro.setImageResource(R.drawable.franciscoout2021);
                            novembro.setImageResource(R.drawable.francisconov2021);
                            dezembro.setImageResource(R.drawable.franciscodez2021);
                            break;

                        case 1:
                            janeiro.setImageResource(R.drawable.franciscojan2022);
                            fevereiro.setImageResource(R.drawable.franciscofev2022);
                            marco.setImageResource(R.drawable.franciscomar2022);
                            abril.setImageResource(R.drawable.franciscoabr2022);
                            maio.setImageResource(R.drawable.franciscomaio2022);
                            junho.setImageResource(R.drawable.franciscojun2022);
                            julho.setImageResource(R.drawable.franciscojul2022);
                            agosto.setImageResource(R.drawable.franciscoago2022);
                            setembro.setImageResource(R.drawable.franciscoset2022);
                            outubro.setImageResource(R.drawable.franciscoout2022);
                            novembro.setImageResource(R.drawable.francisconov2022);
                            dezembro.setImageResource(R.drawable.franciscodez2022);
                            break;

                        case 2:
                            janeiro.setImageResource(R.drawable.franciscojan2023);
                            fevereiro.setImageResource(R.drawable.franciscofev2023);
                            marco.setImageResource(R.drawable.franciscomar2023);
                            abril.setImageResource(R.drawable.franciscoabr2023);
                            maio.setImageResource(R.drawable.franciscomaio2023);
                            junho.setImageResource(R.drawable.franciscojun2023);
                            julho.setImageResource(R.drawable.franciscojul2023);
                            agosto.setImageResource(R.drawable.franciscoago2023);
                            setembro.setImageResource(R.drawable.franciscoset2023);
                            outubro.setImageResource(R.drawable.franciscoout2023);
                            novembro.setImageResource(R.drawable.francisconov2023);
                            dezembro.setImageResource(R.drawable.franciscodez2022);
                            break;
                    }
                } else if (numFuncionario == 1) {
                    switch (position) {
                        case 0:
                            janeiro.setImageResource(R.drawable.mariajan2021);
                            fevereiro.setImageResource(R.drawable.mariafev2021);
                            marco.setImageResource(R.drawable.mariamar2021);
                            abril.setImageResource(R.drawable.mariaabr2021);
                            maio.setImageResource(R.drawable.mariamaio2021);
                            junho.setImageResource(R.drawable.mariajun2021);
                            julho.setImageResource(R.drawable.mariajul2021);
                            agosto.setImageResource(R.drawable.mariaago2021);
                            setembro.setImageResource(R.drawable.mariaset2021);
                            outubro.setImageResource(R.drawable.mariaout2021);
                            novembro.setImageResource(R.drawable.marianov2021);
                            dezembro.setImageResource(R.drawable.mariadez2021);
                            break;

                        case 1:
                            janeiro.setImageResource(R.drawable.mariajan2022);
                            fevereiro.setImageResource(R.drawable.mariafev2022);
                            marco.setImageResource(R.drawable.mariamar2022);
                            abril.setImageResource(R.drawable.mariaabr2022);
                            maio.setImageResource(R.drawable.mariamaio2022);
                            junho.setImageResource(R.drawable.mariajun2022);
                            julho.setImageResource(R.drawable.mariajul2022);
                            agosto.setImageResource(R.drawable.mariaago2022);
                            setembro.setImageResource(R.drawable.mariaset2022);
                            outubro.setImageResource(R.drawable.mariaout2022);
                            novembro.setImageResource(R.drawable.marianov2022);
                            dezembro.setImageResource(R.drawable.mariadez2022);
                            break;

                        case 2:
                            janeiro.setImageResource(R.drawable.mariajan2023);
                            fevereiro.setImageResource(R.drawable.mariafev2023);
                            marco.setImageResource(R.drawable.mariamar2023);
                            abril.setImageResource(R.drawable.mariaabr2023);
                            maio.setImageResource(R.drawable.mariamaio2023);
                            junho.setImageResource(R.drawable.mariajun2023);
                            julho.setImageResource(R.drawable.mariajul2023);
                            agosto.setImageResource(R.drawable.mariaago2023);
                            setembro.setImageResource(R.drawable.mariaset2023);
                            outubro.setImageResource(R.drawable.mariaout2023);
                            novembro.setImageResource(R.drawable.marianov2023);
                            dezembro.setImageResource(R.drawable.mariadez2022);
                            break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}