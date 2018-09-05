package com.example.run;

import com.example.api.Orders;
import com.example.config.AutoConfig;
import com.example.config.Config;
import com.example.implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        Orders orders = (Orders) context.getBean(Order.class);
        orders.displayOrder();
    }
}
