package com.example.rabbitmq.headers;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * @author steven-wan
 * @desc
 * @date 2020-05-31 11:29
 */
public class ReceiverHeader {
    private static final String EXCHANGE_NAME = "header_exchange";

    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "headers");
        String queueName = channel.queueDeclare().getQueue();
        Map<String, Object> hash = new HashMap<>(3);
        hash.put("x-match", "all");
        hash.put("name", "steven");
        hash.put("age", "18");


        channel.queueBind(queueName, EXCHANGE_NAME, "", hash);
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" +
                    delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");
            System.out.println(delivery.getProperties());
        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
        });
    }
}
