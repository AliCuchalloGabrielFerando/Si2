package com.example.si2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText correo;
    private EditText contraseña;
    private TextView olvidarContraseña;
    private TextView crearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        olvidarContraseña = findViewById(R.id.olvidar);
        crearCuenta = findViewById(R.id.nuevo);
        olvidarContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OlvidarContra.class);
                startActivity(intent);
            }
        });

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CrearCuenta.class);
                startActivity(intent);
            }
        });
    }

    public void iniciar(View view) {
        if (correo.getText().length()> 0 && contraseña.getText().length()>0){
            Toast.makeText(this, "bienvenido", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MenuProductos.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "no todavia", Toast.LENGTH_SHORT).show();
        }
    }
}