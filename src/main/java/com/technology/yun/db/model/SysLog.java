package com.technology.yun.db.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "yun")
public class SysLog {
    private String log;
}
