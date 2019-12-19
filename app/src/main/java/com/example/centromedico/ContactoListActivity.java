package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.centromedico.adapters.ContactoAdaptador;
import com.example.centromedico.helpers.QueueUtils;
import com.example.centromedico.models.Contacto;

public class ContactoListActivity extends AppCompatActivity {
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    QueueUtils.QueueObject queue = null;
    ContactoAdaptador itemsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_list);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        contactosList = findViewById(R.id.contactosList);
        contactoAdaptador = new ContactoAdaptador(
                this,
                Contacto.getCollection(),
                queue.getImageLoader());
        contactosList.setAdapter(contactoAdaptador);

    }
}
