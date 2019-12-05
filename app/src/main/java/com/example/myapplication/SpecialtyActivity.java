package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpecialtyActivity extends AppCompatActivity {

    Button btnHome;
    Button btnDetalle;
    //pinshi comentario
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialty);
        btnHome = findViewById(R.id.btnHome);
        btnDetalle = findViewById(R.id.btnDetalle);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SpecialtyActivity.this,
                        MainActivity.class);
                startActivity(o);
            }
        });
        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SpecialtyActivity.this,
                        SpecialtyDetailActivity.class);
                startActivity(o);
            }
        });
    }
}
