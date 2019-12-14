package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUpActivity extends AppCompatActivity {
    Button btnRegister;
    TextView txtSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        txtSingIn = findViewById(R.id.txtSingIn);
        btnRegister = findViewById(R.id.btnRegister);
        txtSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SingUpActivity.this,
                        SingInActivity.class);
                startActivity(o);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SingUpActivity.this,
                        SingInActivity.class);
                startActivity(o);
            }
        });
    }
}
