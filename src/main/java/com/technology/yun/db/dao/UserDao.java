package com.technology.yun.db.dao;

import com.technology.yun.db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @Date 2020/09/02 18:15
 * @Created by 陈康钟(15967160657@163.com)
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findUserByNickname(String nickname);
}
