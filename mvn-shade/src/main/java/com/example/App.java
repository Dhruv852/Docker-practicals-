package com.example;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String,String> data = new HashMap<>();

        data.put("app","Shade Demo");
        data.put("status","SUCCESS");

        Gson gson = new Gson();

        System.out.println(
                gson.toJson(data)
        );
    }
}
