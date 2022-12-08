package com.example.hotelparadise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CodeActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        findViewById(R.id.button_validate).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_validate:

                if(((TextView) findViewById(R.id.one)).getText().toString().matches("") ||
                        ((TextView) findViewById(R.id.two)).getText().toString().matches("") ||
                        ((TextView) findViewById(R.id.three)).getText().toString().matches("") ||
                        ((TextView) findViewById(R.id.four)).getText().toString().matches("")){
                    new AlertDialog.Builder(CodeActivity.this)
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