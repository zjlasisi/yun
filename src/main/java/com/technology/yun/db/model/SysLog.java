package com.technology.yun.db.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Document
public class SysLog implements Serializable {
    private String log;
    private Date createdAt;
}
