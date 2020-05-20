package com.example.redis;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author steven-wan
 * @desc
 * @date 2020-05-20 17:37
 */
@Data
public class Person {
    String firstname;
    String lastname;
    Address address;
    Date date;
    LocalDateTime localDateTime;
}
