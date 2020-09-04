package com.technology.yun.common;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Date 2020/09/04 14:36
 * @Created by 陈康钟(15967160657@163.com)
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue ckz() {
        return new Queue("ckz", true);
    }
}
