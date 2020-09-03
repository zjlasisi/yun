package com.technology.yun.controller;

import com.technology.yun.db.model.SysLog;
import com.technology.yun.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/addSysLog")
    public void addSysLog(@RequestBody SysLog sysLog) {
        sysLogService.addSysLog(sysLog);
    }

    @RequestMapping("/getSysLogList")
    public List<SysLog> getSysLogList() {
        return sysLogService.getSysLogList();
    }
}
