package com.example.implementation;

import com.example.api.Pizzas;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Capri implements Pizzas {

    private String name;
    private int price;

    // @Value i have to declare values for spring otherwise spring use null
    public Capri(@Value("Capri") String name, @Value("12") int price) {
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
