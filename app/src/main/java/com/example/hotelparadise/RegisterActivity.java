package com.example.hotelparadise;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.button_register).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                break;
            case R.id.button_register:
                if(((TextView) findViewById(R.id.name)).getText().toString().matches("") ||
                    ((TextView) findViewById(R.id.email)).getText().toString().matches("") ||
                    ((TextView) findViewById(R.id.cellphone)).getText().toString().matches("") ||
                    ((TextView) findViewById(R.id.password)).getText().toString().matches("") ||
                    ((TextView) findViewById(R.id.confirm_password)).getText().toString().matches("")){
                        new AlertDialog.Builder(RegisterActivity.this)
                                .setTitle("Hotel Paradise")
                                .setMessage("necesitas llenar todos los campos")
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                    }
                                }).show().create();
                        return;
                }
                startActivity(new Intent(this, CodeActivity.class));
                finish();
                break;
        }
    }
}