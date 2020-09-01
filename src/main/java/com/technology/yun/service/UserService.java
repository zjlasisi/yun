package com.technology.yun.service;

import com.technology.yun.db.model.User;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/09/01 18:25
 * @Created by 陈康钟(15967160657@163.com)
 */
public interface UserService {
    User getUserById(Long id);

    List<User> getUserList();
}
