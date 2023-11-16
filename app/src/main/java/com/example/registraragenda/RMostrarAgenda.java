package com.example.registraragenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RMostrarAgenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmostrar_agenda);



        TextView txtNMedico = findViewById(R.id.txtNMedico);
        TextView txtNSala = findViewById(R.id.txtNSala);
        TextView txtNFecha = findViewById(R.id.txtNFecha);
        TextView txtNHorario = findViewById(R.id.txtNHorario);

        Intent intent = getIntent();
        if(intent != null){
            String MEDICO = getIntent().getStringExtra("medico");
            String SALA = getIntent().getStringExtra("box");
            String FECHA = getIntent().getStringExtra("fecha");
            String HORARIO = getIntent().getStringExtra("Horario");

            txtNMedico.setText(MEDICO);
            txtNSala.setText(SALA);
            txtNFecha.setText(FECHA);
            txtNHorario.setText(HORARIO);
        }

    }
}