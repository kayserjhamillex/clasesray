package com.example.centromedico.models;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.centromedico.ContactoListActivity;
import com.example.centromedico.helpers.QueueUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Contacto {
    public String phone;
    public String nickname;
    public String image;

    public String getSmallImage(){
        return this.image;
    };

    public Contacto(String _phone, String _nickname,String _image) {
        this.phone = _phone;
        this.nickname = _nickname;
        this.image = _image;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("981999923", "Bichito","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-3.jpg"));
        collection.add(new Contacto("9859913923", "Plaga","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"));
        collection.add(new Contacto("981914213", "Libelula","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-7.jpg"));
        collection.add(new Contacto("958899251", "Jhamillex","https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg"));
        return collection;
    }
    public static void injectContactsFromCloud(final QueueUtils.QueueObject o,
                                               final ArrayList<Contacto> collection,
                                               final ContactoListActivity _interface) {
        String url = "http://fipo.equisd.com/api/users.json";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        if (response.has("objects")) {

                            try {
                                JSONArray list = response.getJSONArray("objects");
                                for (int i=0; i < list.length(); i++) {
                                    JSONObject o = list.getJSONObject(i);
                                    collection.add(new Contacto(o.getString("first_name"),
                                            o.getString("last_name"),(o.getString("avatar"))));
                                }

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            _interface.refreshList(); // Esta función debemos implementarla
                            // en nuestro activity
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        o.addToRequestQueue(jsonObjectRequest);
    }
}
