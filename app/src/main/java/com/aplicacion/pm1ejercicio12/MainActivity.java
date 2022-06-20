package com.aplicacion.pm1ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aplicacion.pm1ejercicio12.Configuraciones.Personas;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombres, editTextApellidos, editTextEdad, editTextCorreo;

    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNombres = (EditText) findViewById(R.id.txtnombres);
        editTextApellidos = (EditText) findViewById(R.id.txtApellidos);
        editTextEdad = (EditText) findViewById(R.id.txtedad);
        editTextCorreo = (EditText) findViewById(R.id.txtcorreo);

        botonEnviar = (Button) findViewById(R.id.tbnEnviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Personas nuevaPersona = new Personas();
                nuevaPersona.setNombres(editTextNombres.getText().toString());
                nuevaPersona.setApellidos(editTextApellidos.getText().toString());
                nuevaPersona.setEdad(editTextEdad.getText().toString());
                nuevaPersona.setCorreo(editTextCorreo.getText().toString());

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

                intent.putExtra("putnombres", nuevaPersona.getNombres());
                intent.putExtra("putapellidos",nuevaPersona.getApellidos());
                intent.putExtra("putedad",nuevaPersona.getEdad());
                intent.putExtra("putcorreo",nuevaPersona.getCorreo());
                startActivity(intent);
            }
        });

    }
}