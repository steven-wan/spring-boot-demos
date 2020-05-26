package com.example.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SpringBootRabbitmqApplication {

	public static void main(String[] args) {

		List<String> dd = Collections.nCopies(6, "dd");
		dd.forEach(System.out::println);

		//SpringApplication.run(SpringBootRabbitmqApplication.class, args);
	}

}
