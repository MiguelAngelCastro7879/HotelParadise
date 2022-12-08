package com.example.hotelparadise.adapters;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelparadise.DetailsActivity;
import com.example.hotelparadise.R;
import com.example.hotelparadise.models.Habitacion;

import java.util.List;

public class HabitaciónAdapter extends RecyclerView.Adapter<HabitaciónAdapter.ViewHolder> {
    List<Habitacion> habitaciones;

    public HabitaciónAdapter(List<Habitacion> habitacion){
        habitaciones = habitacion;
    }
    @NonNull
    @Override
    public HabitaciónAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.habitacion_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HabitaciónAdapter.ViewHolder holder, int position) {

        Habitacion h = habitaciones.get(position);
        holder.llenar(h);

    }

    @Override
    public int getItemCount() {
        return habitaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Habitacion hab;
        ImageView favorito;
        TextView nombre;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.name);
            favorito = itemView.findViewById(R.id.favorito);


            favorito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    favorito.setImageResource(R.drawable.ic_baseline_favorite_24);
                    favorito.setEnabled(false);

                    Singleton.getInstance(hab);
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailsActivity.class));
                }
            });
        }

        public void llenar(Habitacion h) {
            nombre.setText(h.getNombre());
            hab = h;
            if(Singleton.getNames(h.getNombre())){
                favorito.setImageResource(R.drawable.ic_baseline_favorite_24);
                favorito.setEnabled(false);
            }
        }

    }
}
