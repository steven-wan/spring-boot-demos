package com.example.springbootexternalizeconfiguration.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author steven-wan
 * @desc
 * @date 2020-04-26 14:05
 */
@Data
@ConfigurationProperties(prefix = "my.datesources")
public class Datesources {
    private String url;
    private String name;
    private String password;

    private String classname;

    public Datesources() {
    }

    public Datesources(String classname) {
        this.classname = classname;
    }
}
