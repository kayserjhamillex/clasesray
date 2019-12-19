package com.example.centromedico.models;

import java.util.ArrayList;

public class Contacto {
    public String phone;
    public String nickname;

    public Contacto(String _phone, String _nickname) {
        this.phone = _phone;
        this.nickname = _nickname;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("981999923", "Bichito"));
        collection.add(new Contacto("9859913923", "Plaga"));
        collection.add(new Contacto("981914213", "Libelula"));
        return collection;
    }
}
