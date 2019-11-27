package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAbaoutUs;
    Button btnSpecialty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbaoutUs = findViewById(R.id.btnAbaoutUs);
        btnSpecialty = findViewById(R.id.btnSpecialty);
        btnAbaoutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent o = new Intent(MainActivity.this,
                            AboutUs.class);
                    startActivity(o);
            }
        });
        btnSpecialty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,
                        SpecialtyActivity.class);
                startActivity(o);
            }
        });
    }
}
