package com.example.implementation;

import com.example.api.Pizzas;

public class Margeritta implements Pizzas {

    private String name;
    private int price;

    public Margeritta(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
