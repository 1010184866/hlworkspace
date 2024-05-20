package com.hl.crud_hl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.hl.crud_hl.mapper","com.hl.crud_hl.dao"})
@SpringBootApplication
public class CrudHlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudHlApplication.class, args);
    }

}
