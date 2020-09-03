package com.technology.yun.service;

import com.technology.yun.db.model.SysLog;

import java.util.List;

public interface SysLogService {
    void addSysLog(SysLog sysLog);

    List<SysLog> getSysLogList();
}
