package com.cxq.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 第一种属性注入方式：@ConfigurationProperties 作用于类
 * @Component: 声明此类是 Spring 管理类
 * @ConfigurationProperties: 设置 `prefix = "personinfo"` 属性，这样它就可以读取前缀为 `personinfo` 配置项，
 *                           注入到配置类对应的同名属性上。
 */
//@Component
//@ConfigurationProperties(prefix = "personinfo")
public class PersonInfo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}