package com.technology.yun.db.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Date 2020/09/03 17:32
 * @Created by 陈康钟(15967160657@163.com)
 */
@Data
public class Goods implements Serializable {
    private Long id;
    private String name;
}
