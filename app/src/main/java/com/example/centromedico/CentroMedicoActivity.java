package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CentroMedicoActivity extends AppCompatActivity {
    Button btnSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_medico);
        btnSingIn = findViewById(R.id.btnSingIn);
        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(CentroMedicoActivity.this,
                        SingInActivity.class);
                startActivity(o);
            }
        });
    }
}
