package com.example.myapplication.models;
import java.util.ArrayList;
import java.util.List;
public class Users {
    public String username;
    public String password;

    public static Boolean paswordIsValid(
            String User,
            String Password){
        for (Users i: getUsers()
             ) {
            if (i.username.equals(User)){
                if (i.password.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }
    public static List<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<>();
        Users o = new Users();
        o.username = "jhamillex";
        o.password = "jhamillex";
        list.add(o);
        Users t = new Users();
        t.username = "thania";
        t.password = "thania";
        list.add(t);
        Users x = new Users();
        x.username = "jhenny";
        x.password = "jhenny";
        list.add(x);
        Users y = new Users();
        y.username = "chio";
        y.password = "chio";
        list.add(y);
        return list;
    }
}
