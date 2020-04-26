package com.example.springbootexternalizeconfiguration;

import com.example.springbootexternalizeconfiguration.demo.MyBean;
import com.example.springbootexternalizeconfiguration.demo.MyBeanYml;
import com.example.springbootexternalizeconfiguration.demo.YmlConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootExternalizeConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication();

		ConfigurableApplicationContext run = SpringApplication.run(SpringBootExternalizeConfigurationApplication.class, args);
		MyBeanYml myBeanYml = run.getBean("myBeanYml", MyBeanYml.class);

		myBeanYml.printNameValue();
	}

}
