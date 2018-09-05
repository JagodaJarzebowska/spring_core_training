package com.example.implementation;

import com.example.api.Orders;
import com.example.api.Pizzas;
import org.springframework.stereotype.Component;

@Component
public class Order  implements Orders {

    private Pizzas pizzas;

    public Order(Pizzas pizzas) {
        this.pizzas = pizzas;
    }

    public void displayOrder() {
        System.out.println("Order: " + pizzas.getName() + " price: " + pizzas.getPrice());
    }
}
