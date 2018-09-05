package com.example.implementation;

import com.example.api.Orders;
import com.example.api.Pizzas;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order  implements Orders {

    private Pizzas pizzas;

    // @Qualifier - class name lowercase - or I can use @Qualifier annotation on Capri.class and use other name
    public Order(@Qualifier("capri") Pizzas pizzas) {
        this.pizzas = pizzas;
    }

    public void displayOrder() {
        System.out.println("Order: " + pizzas.getName() + " price: " + pizzas.getPrice());
    }
}
