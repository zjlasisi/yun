package com.technology.yun.db.dao;

import com.technology.yun.db.model.SysLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/09/02 18:32
 * @Created by 陈康钟(15967160657@163.com)
 */
public interface SysLogDao extends MongoRepository<SysLog, Long> {
    List<SysLog> findSysLogsByLogContains(String log);
}
