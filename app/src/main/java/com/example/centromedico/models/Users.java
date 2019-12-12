package com.example.centromedico.models;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Users {
    public String FullName;
    public String username;
    public String password;

    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
    public static Boolean paswordIsValid(
            String User,
            String Password){
        for (Users i: getUsers()
        ) {
            if (i.username.equals(User)){
                if (i.password.equals(Password) && i.password.length()>0 && i.password.length()<=50){
                    return true;
                }
            }
        }
        return false;
    }
    public static List<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<>();
        Users o = new Users();
        //nombre del desarrollador dev.v0
        o.username = "jhamillex@gmail.com";
        o.password = "jhamillex";
        o.FullName = "Anibal Jhamil Huaman Verastein";
        list.add(o);
        Users t = new Users();
        //este es el nombre de mi enamorada attm:jhamillex
        t.username = "thania@gmail.com";
        t.password = "thania";
        o.FullName = "Thania Del Castillo Hernandez";
        list.add(t);
        Users x = new Users();
        //nombre del desarrollador dev.v1
        x.username = "jhenny@gmail.com";
        x.password = "jhenny";
        o.FullName = "Jhenny Yessica Contreras Llantoy";
        list.add(x);
        Users y = new Users();
        //nombre del desarrollador dev.v2
        y.username = "chio@gmail.com";
        y.password = "chio";
        o.FullName = "Carmen Rossio Rios Naula";
        list.add(y);
        return list;
    }
}
