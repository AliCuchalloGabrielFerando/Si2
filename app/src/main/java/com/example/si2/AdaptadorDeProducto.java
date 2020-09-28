package com.example.si2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorDeProducto extends RecyclerView.Adapter<AdaptadorDeProducto.ViewHolder> {
    private List<Producto> listaProductos;
    private ItemClick itemClick;

    public AdaptadorDeProducto(List<Producto> listaProductos,ItemClick itemClick) {
        this.listaProductos = listaProductos;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productos,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Producto producto = listaProductos.get(position);
        holder.nombre.setText(producto.getNombre());
        holder.descripcion.setText(producto.getDescripcion());
        holder.precio.setText(String.valueOf(producto.getPrecio()));
        holder.cantidad.setText(String.valueOf(producto.getCantidad()));
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        TextView precio;
        TextView cantidad;
        TextView descripcion;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            precio = itemView.findViewById(R.id.precio);
            cantidad = itemView.findViewById(R.id.cantidad);
            descripcion = itemView.findViewById(R.id.descripcion);
            imagen = itemView.findViewById(R.id.imagen);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClick.onClick(getAdapterPosition());
                }
            });

        }
    }
}
