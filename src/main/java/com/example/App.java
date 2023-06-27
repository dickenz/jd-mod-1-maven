package com.example;

import com.google.gson.Gson;

public class App {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        String name = "Iryna";
        String lastName = "Yavorska";

        Person person = new Person(name, lastName);
        String jsonOutput = gson.toJson(person);

        System.out.println(jsonOutput);
    }
}


