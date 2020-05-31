package com.example.rabbitmq.springamqp.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author steven-wan
 * @desc
 * @date 2020-05-28 16:06
 */
@RabbitListener(queues = "hello")
public class Tut1Receiver {
    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}
