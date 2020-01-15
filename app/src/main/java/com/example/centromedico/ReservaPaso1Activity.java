package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReservaPaso1Activity extends AppCompatActivity {
    Button  reservar2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_paso1);
        reservar2 = findViewById(R.id.reservar2);
        reservar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(ReservaPaso1Activity.this, ReservaPaso2Activity.class);
                startActivity(o);
            }
        });




    }
}
