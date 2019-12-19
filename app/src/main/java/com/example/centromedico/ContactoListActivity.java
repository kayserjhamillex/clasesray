package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.centromedico.adapters.ContactoAdaptador;
import com.example.centromedico.models.Contacto;

public class ContactoListActivity extends AppCompatActivity {
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_list);
        contactosList = findViewById(R.id.contactosList);
        contactoAdaptador = new ContactoAdaptador(this, Contacto.getCollection());
        contactosList.setAdapter(contactoAdaptador);
    }
}
