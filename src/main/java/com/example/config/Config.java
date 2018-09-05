package com.example.config;

import com.example.api.Orders;
import com.example.api.Pizzas;
import com.example.implementation.Margeritta;
import com.example.implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Pizzas pizzas(){
        return new Margeritta("Margeritta",25);
    }

    @Bean
    public Orders orders(Pizzas pizzas){
        return new Order(pizzas);
    }
}