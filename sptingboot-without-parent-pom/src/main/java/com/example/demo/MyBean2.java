package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author steven-wan
 * @desc
 * @date 2020-04-18 22:22
 */
@Component
@Order(2)
public class MyBean2 implements CommandLineRunner {

    @Override
    public void run(String... args) {
        // Do something...
        System.out.println("args order2");

    }

}