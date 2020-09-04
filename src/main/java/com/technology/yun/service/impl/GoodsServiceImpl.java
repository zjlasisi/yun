package com.technology.yun.service.impl;

import com.technology.yun.db.dao.GoodsMapper;
import com.technology.yun.db.model.Goods;
import com.technology.yun.service.GoodsService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2020/09/03 17:22
 * @Created by 陈康钟(15967160657@163.com)
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void buy(Long id) {
        Goods goods = goodsMapper.selectById(id);
        //通过rabbitmq向订单api发送下单请求
        System.out.println("下单消息开始发送");
        rabbitTemplate.convertAndSend("ckz", goods);
        rabbitTemplate.convertAndSend("amq.topic","topic.message", goods);
        rabbitTemplate.convertAndSend("amq.topic","topic.ckz", goods);
        rabbitTemplate.convertAndSend("amq.fanout","", goods);
        System.out.println("下单消息发送完毕");
    }
}
