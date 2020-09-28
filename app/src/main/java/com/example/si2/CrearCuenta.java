package com.example.si2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CrearCuenta extends AppCompatActivity {
    private TextView nombre;
    private TextView correo;
    private TextView contraseña;
    private TextView contraseñaverficar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        nombre = findViewById(R.id.nombre);
        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        contraseñaverficar = findViewById(R.id.contraseñas);
    }
}