package com.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.data.redis.hash.Jackson2HashMapper;
import org.springframework.data.redis.hash.ObjectHashMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.o;

@SpringBootApplication
@Controller
public class RedisApplication {

    @Autowired
    private RedisTest redisTest;

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String redis() {
        HashOperations<String, byte[], byte[]> hashOperations = redisTest.getTemplate().opsForHash();


        Person person = getPerson();

        HashOperations<String, String, Object> d = redisTest.getTemplate().opsForHash();
        Person person1 = jackson2HashMapper(d, person);
        return person1.toString();
    }

    public Person jackson2HashMapper(HashOperations<String, String, Object> hashOperations, Person person) {
        Jackson2HashMapper jackson2HashMapper = new Jackson2HashMapper(false);
        Map<String, Object> stringObjectMap = jackson2HashMapper.toHash(person);


        hashOperations.putAll("person", stringObjectMap);

        Map<String, Object> person1 = hashOperations.entries("person");
        Person o = (Person) jackson2HashMapper.fromHash(person1);
        return o;
    }

    public Person objectHashMapper(HashOperations<String, byte[], byte[]> hashOperations, Person person) {
        HashMapper<Object, byte[], byte[]> mapper = new ObjectHashMapper();
        Map<byte[], byte[]> mappedHash = mapper.toHash(person);
        hashOperations.putAll("person", mappedHash);

        Map<byte[], byte[]> loadedHash = hashOperations.entries("person");
        Person o = (Person) mapper.fromHash(loadedHash);
        return o;
    }

    private Person getPerson() {
        Person person = new Person();
        person.setFirstname("wan");
        person.setLastname("steven");
        person.setDate(new Date());
        person.setLocalDateTime(LocalDateTime.now());

        Address address = new Address();
        address.setCity("wuhan");
        address.setCountry("china");

        person.setAddress(address);
        return person;
    }


}
