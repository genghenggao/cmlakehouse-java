package com.henggao.cmlake;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(
        basePackages = "com.henggao.cmlake.mapper"
)
public class CmlakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmlakeApplication.class, args);
    }

}
