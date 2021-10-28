package com.cxq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication注解，声明是一个 springboot 应用。
 * 通过该注解，使springboot自动配置等
 */
@SpringBootApplication
public class Demo1HelloWorldApplication {
    //通过run方法启动springboot应用
    public static void main(String[] args) {
        SpringApplication.run(Demo1HelloWorldApplication.class, args);
    }

}
