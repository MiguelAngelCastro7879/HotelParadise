package com.example.hotelparadise.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailsActivity.class));
                }
            });
        }

        public void llenar(Habitacion h) {
        }

    }
}
