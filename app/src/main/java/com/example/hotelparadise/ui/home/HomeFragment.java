package com.example.hotelparadise.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelparadise.R;
import com.example.hotelparadise.adapters.HabitaciónAdapter;
import com.example.hotelparadise.databinding.FragmentHomeBinding;
import com.example.hotelparadise.models.Habitacion;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public RecyclerView rec_habitaciones;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        rec_habitaciones = root.findViewById(R.id.rec_habitaciones);

        llenarRecycler();

        return root;
    }

    void llenarRecycler(){
        List<Habitacion> habitacionesList = new ArrayList<>();
        HabitaciónAdapter ha = new HabitaciónAdapter(habitacionesList);
        habitacionesList.add(new Habitacion("Hotel Paraiso 1"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 2"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 3"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 4"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 5"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 6"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 7"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 8"));
        habitacionesList.add(new Habitacion("Hotel Paraiso 9"));
        rec_habitaciones.setHasFixedSize(true);
        rec_habitaciones.setLayoutManager(new GridLayoutManager(binding.getRoot().getContext(), 2));
        rec_habitaciones.setAdapter(ha);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}