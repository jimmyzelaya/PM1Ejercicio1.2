package com.aplicacion.pm1ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView nombres, apellidos, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nombres = (TextView) findViewById(R.id.lblNombres);
        apellidos = (TextView) findViewById(R.id.lblApellidos);
        edad = (TextView) findViewById(R.id.lblEdad);
        correo = (TextView) findViewById(R.id.lblCorreo);

        nombres.setText(getIntent().getStringExtra("putnombres"));
        apellidos.setText(getIntent().getStringExtra("putapellidos"));
        edad.setText(getIntent().getStringExtra("putedad"));
        correo.setText(getIntent().getStringExtra("putcorreo"));
    }
}