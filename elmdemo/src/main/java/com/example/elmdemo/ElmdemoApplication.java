package com.example.elmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElmdemoApplication.class, args);
    }

}
//package com.example.elmdemo;
//
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//@MapperScan("com.example.elmdemo.mapper")
//public class ElmdemoApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(ElmdemoApplication.class, args);
//    }
//}