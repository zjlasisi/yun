package com.technology.yun.service.impl;

import com.technology.yun.db.dao.SysLogDao;
import com.technology.yun.db.model.SysLog;
import com.technology.yun.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public void addSysLog(SysLog sysLog) {
        mongoTemplate.save(sysLog);
    }

    @Override
    public List<SysLog> getSysLogList() {
        return sysLogDao.findSysLogsByLogContains("33");
    }
}
