package com.hl.crud_hl.DB;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component // 必须要有这个注解,否则无法在其他地方自动注入
@ConfigurationProperties(prefix="spring.datasource")
@Data
public class dbProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String initialSize;
    private String minIdle;
    private String maxActive;
    private String maxWait;
    private String showsql;
}
