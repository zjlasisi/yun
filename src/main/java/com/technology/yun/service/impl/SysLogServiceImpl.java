package com.technology.yun.service.impl;

import com.technology.yun.db.model.SysLog;
import com.technology.yun.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addSysLog(SysLog sysLog) {
        mongoTemplate.save(sysLog);
    }
}
