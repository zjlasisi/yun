package com.technology.yun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.technology.yun.db.dao")
public class YunApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunApplication.class, args);
    }

}
