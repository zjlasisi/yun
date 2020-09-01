package com.technology.yun.controller;

import com.technology.yun.db.model.User;
import com.technology.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/09/01 18:27
 * @Created by 陈康钟(15967160657@163.com)
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
