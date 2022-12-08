package com.example.hotelparadise.ui.favorites;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hotelparadise.R;
import com.example.hotelparadise.adapters.HabitaciónAdapter;
import com.example.hotelparadise.adapters.Singleton;
import com.example.hotelparadise.databinding.FragmentFavoritesBinding;
import com.example.hotelparadise.databinding.FragmentHomeBinding;
import com.example.hotelparadise.databinding.FragmentNotificationsBinding;
import com.example.hotelparadise.models.Habitacion;
import com.example.hotelparadise.ui.notifications.NotificationsViewModel;

import java.util.ArrayList;
import java.util.List;

public class FavoritesFragment extends Fragment {

    private FragmentFavoritesBinding binding;

    public RecyclerView rec_habitaciones;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavoritesViewModel notificationsViewModel =
                new ViewModelProvider(this).get(FavoritesViewModel.class);

        binding = FragmentFavoritesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        rec_habitaciones = root.findViewById(R.id.rec_habitaciones);

        llenarRecycler();

        return root;
    }

    void llenarRecycler(){
        HabitaciónAdapter ha = new HabitaciónAdapter(Singleton.getFavs());
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