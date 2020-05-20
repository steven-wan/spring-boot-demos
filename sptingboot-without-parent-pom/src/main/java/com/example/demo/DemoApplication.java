package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
public class DemoApplication {
	@RequestMapping(value = "/name",method={RequestMethod.GET})
	String home(HttpServletRequest request) {
		String userAgent = request.getHeader("User-Agent");
		if (userAgent.contains("AlipayClient")){
			System.out.println("客户端是支付宝");
		} else if (userAgent.contains("MicroMessenger")){
			System.out.println("客户端是微信");
		} else {
			System.out.println("客户端是其它扫描"+userAgent);
		}

		return "Hello steven.wan!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
