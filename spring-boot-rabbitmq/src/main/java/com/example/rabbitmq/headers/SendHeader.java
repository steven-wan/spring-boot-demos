package com.example.rabbitmq.headers;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author steven-wan
 * @desc
 * @date 2020-05-31 11:29
 */
public class SendHeader {
    private static final String EXCHANGE_NAME = "header_exchange";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            channel.exchangeDeclare(EXCHANGE_NAME, "headers");
            Map<String, Object> headers1 = new HashMap<>();
            headers1.put("name", "steven");
            headers1.put("age", "18");
            AMQP.BasicProperties build1 = new AMQP.BasicProperties();
            AMQP.BasicProperties build = build1.builder().headers(headers1).build();


            String message = "Hello World!";

            channel.basicPublish(EXCHANGE_NAME, "", build, message.getBytes("UTF-8"));

            System.out.println("send message:" + message);

        }
    }
}
