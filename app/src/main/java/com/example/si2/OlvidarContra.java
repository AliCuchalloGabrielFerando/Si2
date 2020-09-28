package com.example.si2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OlvidarContra extends AppCompatActivity {
    private TextView correo;
    private TextView contraseña;
    private TextView contraseñaverficar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidar_contra);
        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        contraseñaverficar = findViewById(R.id.contraseñas);
    }
}