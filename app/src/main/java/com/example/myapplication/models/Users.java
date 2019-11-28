package com.example.myapplication.models;
import android.util.Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {
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
        o.username = "jhamillex@gmail.com";
        o.password = "jhamillex";
        list.add(o);
        Users t = new Users();
        t.username = "thania@gmail.com";
        t.password = "thania";
        list.add(t);
        Users x = new Users();
        x.username = "jhenny@gmail.com";
        x.password = "jhenny";
        list.add(x);
        Users y = new Users();
        y.username = "chio@gmail.com";
        y.password = "chio";
        list.add(y);
        return list;
    }
}
