package com.example.redis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author steven-wan
 * @desc
 * @date 2020-05-20 17:18
 */
@Component
@Data
public class RedisTest {
    private RedisTemplate template;

    @Autowired
    public RedisTest(RedisTemplate redisTemplate) {
        this.template = redisTemplate;
    }

}
