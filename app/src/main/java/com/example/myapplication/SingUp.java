package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SingUp extends AppCompatActivity {

    Button btnRegister;
    EditText txtDNI;
    EditText txtFullName;
    EditText txtCarnet;
    EditText txtFecha;
    EditText txtUser;
    EditText txtPassword;
    EditText txtRePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        btnRegister = findViewById(R.id.btnRegister);
        txtDNI = findViewById(R.id.txtDNI);
        txtFullName = findViewById(R.id.txtFullName);
        txtCarnet = findViewById(R.id.txtCarnet);
        txtFecha = findViewById(R.id.txtFecha);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        txtRePassword = findViewById(R.id.txtRePassword);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SingUp.this,
                        MainActivity.class);
                startActivity(o);
            }
        });
    }
}
