package com.example.centromedico;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.centromedico.adapters.SpecialityAdapter;
import com.example.centromedico.models.Specialty;

public class PruebaActivity extends AppCompatActivity {

    ListView specialitylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        specialitylist = findViewById(R.id.listspeciality);
        SpecialityAdapter adapter = new SpecialityAdapter(
                this, Specialty.getData());
        specialitylist.setAdapter(adapter);
    }

}
