package com.example.implementation;

import com.example.api.Pizzas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Margeritta implements Pizzas {

    private String name;
    private int price;

    public Margeritta(@Value("Margeritta") String name,@Value("29") int price) {
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
