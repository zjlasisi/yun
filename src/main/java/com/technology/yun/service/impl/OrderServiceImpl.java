package com.technology.yun.service.impl;

import com.rabbitmq.client.Channel;
import com.technology.yun.db.model.Goods;
import com.technology.yun.service.OrderService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/09/03 17:39
 * @Created by 陈康钟(15967160657@163.com)
 */
@Service
public class OrderServiceImpl implements OrderService {

    @RabbitHandler
    @RabbitListener(queues = "ckz")
    public void handleOrder(@Payload Goods goods, @Headers Map<String, Object> headers, Channel channel) throws Exception {
//        channel.basicAck((Long) headers.get(AmqpHeaders.DELIVERY_TAG), false);
        System.out.println("消息已确认");
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.message")
    public void a(@Payload Goods goods) {
        System.out.println("a消息已确认");
    }

    @RabbitHandler
    @RabbitListener(queues = "topic.messages")
    public void b(@Payload Goods goods) {
        System.out.println("b消息已确认");
    }

    @RabbitHandler
    @RabbitListener(queues = "fanout.A")
    public void fa(@Payload Goods goods) {
        System.out.println("fa消息已确认");
    }

    @RabbitHandler
    @RabbitListener(queues = "fanout.B")
    public void fb(@Payload Goods goods) {
        System.out.println("fb消息已确认");
    }
}
