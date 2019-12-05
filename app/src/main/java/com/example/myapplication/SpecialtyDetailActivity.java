package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpecialtyDetailActivity extends AppCompatActivity {

    Button btnHome;
    Button btnCita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialty_detail);
        btnHome = findViewById(R.id.btnHome);
        btnCita = findViewById(R.id.btnCita);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SpecialtyDetailActivity.this,
                        MainActivity.class);
                startActivity(o);
            }
        });
        btnCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SpecialtyDetailActivity.this,
                        MainActivity.class);
                startActivity(o);
            }
        });
    }
}
