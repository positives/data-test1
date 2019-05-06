package com.doone.pudong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(DataTest1Application.class, args);
        System.out.println("-------------------启动成功 data-test1 -----------------------");
    }

}
