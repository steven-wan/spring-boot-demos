package com.example.springbootexternalizeconfiguration.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author steven-wan
 * @desc
 * @date 2020-04-19 17:15
 */
@Component
public class MyBean {


    private String name;


    // ...

    public void printNameValue(){
        System.out.println("name = " + name);
    }
}
