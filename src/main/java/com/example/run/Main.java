package com.example.run;

import com.example.api.Orders;
import com.example.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Orders orders = (Orders) context.getBean("orders");
        orders.displayOrder();
    }
}
