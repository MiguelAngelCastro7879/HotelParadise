package com.example.hotelparadise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ReservationActivity extends AppCompatActivity implements View.OnClickListener, CalendarView.OnDateChangeListener {
    TextView precio,habitaciones, habitaciones_txt;
    CalendarView calendarStart, calendarEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        calendarStart = findViewById(R.id.start_date);
        calendarStart.setMinDate((new Date().getTime()));

        calendarEnd = findViewById(R.id.end_date);
        calendarEnd.setMinDate((new Date().getTime()));

        calendarStart.setOnDateChangeListener(this);
        calendarEnd.setOnDateChangeListener(this);

        findViewById(R.id.payment_method).setOnClickListener(this);
        findViewById(R.id.more).setOnClickListener(this);
        findViewById(R.id.less).setOnClickListener(this);

        habitaciones = findViewById(R.id.habitaciones);
        habitaciones_txt = findViewById(R.id.habitaciones_txt);
        precio = findViewById(R.id.precio);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.acustom_action_bar2);
        View view =getSupportActionBar().getCustomView();

        view.findViewById(R.id.action_bar_back).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int cantidad;
        switch (view.getId()){
            case R.id.payment_method:
                startActivity(new Intent(ReservationActivity.this, PaymentActivity.class));
                break;
            case R.id.action_bar_back:
                finish();
                break;
            case R.id.more:

                cantidad = Integer.parseInt(String.valueOf(habitaciones.getText()));
                if (cantidad < 15){
                    habitaciones.setText(String.valueOf(cantidad + 1));
                    habitaciones_txt.setText(habitaciones.getText());
                    precio.setText(Integer.parseInt((String) habitaciones.getText()) * 1000);
                    return;
                }
                new AlertDialog.Builder(view.getContext())
                        .setTitle("Pizza APP")
                        .setMessage("Upss :( \nNo se cuentan con suficientes habitaciones")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show().create();

                break;
            case R.id.less:
                cantidad = Integer.parseInt(String.valueOf(habitaciones.getText()));
                if (cantidad > 0){
                    habitaciones.setText(String.valueOf(cantidad - 1));
                    habitaciones_txt.setText(habitaciones.getText());
                    precio.setText(Integer.parseInt((String) habitaciones.getText()) * 1000);
                    return;
                }
                new AlertDialog.Builder(view.getContext())
                        .setTitle("Pizza APP")
                        .setMessage("Favor de ingresar un numero valido de habitaciones")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show().create();
                break;
        }
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.YEAR, i);
        startDate.set(Calendar.MONTH, i1);
        startDate.set(Calendar.DAY_OF_MONTH, i2);

        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.YEAR, i);
        endDate.set(Calendar.MONTH, i1);
        endDate.set(Calendar.DAY_OF_MONTH, i2);
//        long different = startDate.getTime() - endDate.getTime();


//        if(){
//            new AlertDialog.Builder(ReservationActivity.this)
//                    .setTitle("Pizza APP")
//                    .setMessage("a")
//                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    }).show().create();

//        }
    }
}