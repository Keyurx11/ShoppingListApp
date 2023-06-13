package com.example.shoppinglistapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingListAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingListAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Logic logic = new Logic();
            logic.menu();
        };
    }
}
