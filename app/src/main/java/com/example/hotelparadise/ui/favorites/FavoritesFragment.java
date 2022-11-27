package com.example.hotelparadise.ui.favorites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hotelparadise.R;
import com.example.hotelparadise.databinding.FragmentFavoritesBinding;
import com.example.hotelparadise.databinding.FragmentNotificationsBinding;
import com.example.hotelparadise.ui.notifications.NotificationsViewModel;

public class FavoritesFragment extends Fragment {

    private FragmentFavoritesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavoritesViewModel notificationsViewModel =
                new ViewModelProvider(this).get(FavoritesViewModel.class);


        binding = FragmentFavoritesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}