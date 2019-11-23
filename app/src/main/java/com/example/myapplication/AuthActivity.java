package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.models.Users;


public class AuthActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnSingUp;
    EditText txtUser;
    EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        btnLogin = findViewById(R.id.btnLogin);
        btnSingUp = findViewById(R.id.btnSingUp);
        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPassword);
        btnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent o = new Intent(AuthActivity.this,
                            SingUp.class);
                    startActivity(o);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Users.paswordIsValid(txtUser.getText().toString(),txtPassword.getText().toString())){
                    Intent o = new Intent(AuthActivity.this,
                            MainActivity.class);
                    startActivity(o);
                }
            }
        });
    }
}
