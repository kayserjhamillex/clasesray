package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAbaoutUs;
    Button btnSpeciality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbaoutUs = findViewById(R.id.btnAbaoutUs);
        btnSpeciality = findViewById(R.id.btnSpeciality);
        btnAbaoutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent o = new Intent(MainActivity.this,
                            AboutUs.class);
                    startActivity(o);
            }
        });
        btnSpeciality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,
                        SpecialtyActivity.class);
                startActivity(o);
            }
        });
    }
}
