package com.example.springbootexternalizeconfiguration.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author steven-wan
 * @desc
 * @date 2020-04-19 17:15
 */
@Component
public class MyBeanYml {

   @Autowired
   private YmlConfiguration ymlConfiguration;

    // ...

    public void printNameValue(){
//        System.out.println(ymlConfiguration.gitDevDatesources());
        System.out.println(ymlConfiguration.gitDevDatesources());
    }
}
