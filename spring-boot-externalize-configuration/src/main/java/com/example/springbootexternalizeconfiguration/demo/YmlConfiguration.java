package com.example.springbootexternalizeconfiguration.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * @author steven-wan
 * @desc
 * @date 2020-04-19 21:18
 */

@Data

@Configuration
@ConfigurationProperties(prefix = "my.drives")
public class YmlConfiguration {

    private String classname;

    @Bean
    @Profile("dev")
    public Datesources gitDevDatesources(){
        return new Datesources(classname);
    }


    @Bean
    @Profile("test")
    public Datesources gitTestDatesources(){
        return new Datesources(classname);
    }
}
