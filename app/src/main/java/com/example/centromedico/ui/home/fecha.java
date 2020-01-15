package com.example.centromedico.ui.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.centromedico.R;
import com.example.centromedico.ReservaPaso1Activity;

import java.util.Calendar;

public class fecha extends AppCompatActivity implements View.OnClickListener {

    Button bfecha;
    EditText bfechaT2;
    Button bfechaS;
    EditText bdechasT1;
    Button btnreserva;
    private int dia, mes,ano,dias,mess,anos;







    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        bfecha = (Button) findViewById(R.id.bfecha);
        bfechaS = (Button) findViewById(R.id.bfechaS);
        bfechaT2 = (EditText) findViewById(R.id.bfechaT2);
        bdechasT1 = (EditText) findViewById(R.id.bdechasT1);
        btnreserva = (Button) findViewById(R.id.btnreservar);
        bfecha.setOnClickListener(this);
        bfechaS.setOnClickListener(this);

        btnreserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(fecha.this,
                        ReservaPaso1Activity.class);
                startActivity(o);
            }
        });
    }


    @Override
    public void onClick(View v) {
        if (v==bfecha) {
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

                    bfechaT2.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            } ,dia,mes,ano );

            datePickerDialog.show();
        }
        if (v==bfechaS) {
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {

                    bdechasT1.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            } ,dias,mess,anos );

            datePickerDialog.show();
        }
    }

}
