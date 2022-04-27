package com.example.jse.m10.s23;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        // name -> phone number
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "43534534534534");           //put mi serve per inserire tom come chiave il numero come valore
        map.put("Bob", "78768679789");

        for (var entry : map.entrySet()) {    //looppami sul set degli entry, ovvero un set che si crea la mappa in cui ci mette tutte le copie chiave valore
            System.out.println(entry.getKey() + ": " + entry.getValue());   //stampa chiave e valore
        }

        for (String key : map.keySet()) {          //posso fare la stessa cosa con il metodo keyset looppando tutte le chiavi
            System.out.println(key + ": " + map.get(key));
        }
    }
}
