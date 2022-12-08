package com.example.hotelparadise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_registro).setOnClickListener(this);
        findViewById(R.id.button_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_registro:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.button_login:
                if(((TextView) findViewById(R.id.credential)).getText().toString().matches("") ||
                        ((TextView) findViewById(R.id.password)).getText().toString().matches("")){
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Hotel Paradise")
                            .setMessage("necesitas llenar todos los campos")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            }).show().create();
                    return;
                }
                startActivity(new Intent(this, MenuActivity.class));
                finish();
                break;
        }
    }
}