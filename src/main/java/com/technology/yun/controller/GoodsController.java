package com.technology.yun.controller;

import com.technology.yun.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/09/03 17:21
 * @Created by 陈康钟(15967160657@163.com)
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/buy/{id}")
    public void buy(@PathVariable Long id) {
        goodsService.buy(id);
    }
}
