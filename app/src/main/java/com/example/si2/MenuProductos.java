package com.example.si2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MenuProductos extends AppCompatActivity implements ItemClick{
    private RecyclerView recycler;
    private List<Producto> listaProducto;
    private  AdaptadorDeProducto adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_productos);
        recycler =findViewById(R.id.recycler);
        listaProducto = new ArrayList<>();
        adaptador = new AdaptadorDeProducto(listaProducto,this);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        cargar();
        adaptador.notifyDataSetChanged();
    }

    public void cargar(){
        listaProducto.add(new Producto("leche",8f,5,"hola"));
        listaProducto.add(new Producto("coca cola",8f,5,"hola"));
        listaProducto.add(new Producto("papitas",8f,5,"hola"));
        listaProducto.add(new Producto("nachos",8f,5,"hola"));
        listaProducto.add(new Producto("four loko",8f,5,"hola"));
    }

    @Override
    public void onClick(int posicion) {
        Toast.makeText(this, listaProducto.get(posicion).getNombre(), Toast.LENGTH_SHORT).show();
    }
}