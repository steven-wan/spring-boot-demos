package com.example.mybatisAndSpringDataJpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.example.mybatisAndSpringDataJpa.mybatis.mapper"})
public class JpaAndMybatisApplication {


    public static void main(String[] args) {
        SpringApplication.run(JpaAndMybatisApplication.class, args);

    }

}
