package com.technology.yun.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.technology.yun.db.dao.UserDao;
import com.technology.yun.db.dao.UserMapper;
import com.technology.yun.db.model.User;
import com.technology.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/09/01 18:26
 * @Created by 陈康钟(15967160657@163.com)
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Long id) {
        User ckz = userDao.findUserByNickname("ckz");
        return ckz;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectList(new QueryWrapper<User>().lambda().eq(User::getNickname, "ckz"));
    }
}
