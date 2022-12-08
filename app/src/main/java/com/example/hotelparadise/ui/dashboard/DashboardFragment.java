package com.example.hotelparadise.ui.dashboard;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hotelparadise.OkayActivity;
import com.example.hotelparadise.PaymentActivity;
import com.example.hotelparadise.R;
import com.example.hotelparadise.RegisterActivity;
import com.example.hotelparadise.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        root.findViewById(R.id.promo1).setOnClickListener(this);
        root.findViewById(R.id.promo2).setOnClickListener(this);
        root.findViewById(R.id.promo3).setOnClickListener(this);
        root.findViewById(R.id.promo4).setOnClickListener(this);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        new AlertDialog.Builder(binding.getRoot().getContext())
                .setTitle("Hotel Paradise")
                .setMessage("Upss :(\nEsta promoción no está disponible")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show().create();
    }
}