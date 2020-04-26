package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @author steven-wan
 * @desc
 * @date 2020-04-12 21:20
 */
public class MyBanner implements Banner {
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println("i am steven.wan");
    }
}
