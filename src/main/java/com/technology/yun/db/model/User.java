package com.technology.yun.db.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description TODO
 * @Date 2020/09/01 18:23
 * @Created by 陈康钟(15967160657@163.com)
 */
@Data
@Entity
public class User {
    @Id
    private Long id;
    private String nickname;
    private String cellphone;
}
