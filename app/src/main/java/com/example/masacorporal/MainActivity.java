package com.example.masacorporal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double gravedad = 9.81;
    EditText etMasa, etAltura;
    TextView Resultado;
    Button Calcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMasa = (EditText) findViewById(R.id.edMasa);
        etAltura = (EditText) findViewById(R.id.etAltura);
        Resultado = (TextView) findViewById(R.id.textView3);
        Calcular = (Button) findViewById(R.id.btnResultado);


        };

}
