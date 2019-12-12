package com.example.centromedico.models;

import java.util.ArrayList;

public class Specialty {
    public String name;
    public String descripcion;

    public Specialty(String _name, String _descripcion){
        this.name=_name;
        this.descripcion=_descripcion;
    }

    public String toString(){
        return this.name;
    }

    public static ArrayList<Specialty> getData(){
        ArrayList<Specialty> especialidad = new ArrayList<>();
        especialidad.add(new Specialty("Medicina General","hellouda"));
        return especialidad;
    }



}
