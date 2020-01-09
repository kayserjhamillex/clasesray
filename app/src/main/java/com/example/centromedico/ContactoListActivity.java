package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.centromedico.adapters.ContactoAdaptador;
import com.example.centromedico.helpers.QueueUtils;
import com.example.centromedico.models.Contacto;

import java.util.ArrayList;

public class ContactoListActivity extends AppCompatActivity {
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    QueueUtils.QueueObject queue = null;
    ArrayList<Contacto> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto_list);
        contactosList = findViewById(R.id.contactosList);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        items = new ArrayList<>();
        Contacto.injectContactsFromCloud(queue, items, this);
        contactoAdaptador = new ContactoAdaptador(
                this,
                items,
                queue.getImageLoader());
        contactosList.setAdapter(contactoAdaptador);
    }
    public void refreshList(){
        if ( contactoAdaptador!= null ) {
            contactoAdaptador.notifyDataSetChanged();
        }
    }
}
