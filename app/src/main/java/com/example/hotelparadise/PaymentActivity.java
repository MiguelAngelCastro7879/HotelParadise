package com.example.hotelparadise;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.acustom_action_bar2);
        View view =getSupportActionBar().getCustomView();

        view.findViewById(R.id.action_bar_back).setOnClickListener(this);

        findViewById(R.id.finish_payment).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.finish_payment:
                startActivity(new Intent(PaymentActivity.this, OkayActivity.class));
                finish();
            case R.id.action_bar_back:
                finish();
        }
    }
}