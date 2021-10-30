package com.cxq.demo.controller;

import com.cxq.demo.pojo.PersonInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 第二种属性注入方式：@ConfigurationProperties 作用于方法
 * 1. 使用 @Configuration 声明此类为配置类
 * 2. 使用 @Bean 将 PersonInfo 类的对象放入 IOC 容器中
 * 3. 使用 @ConfigurationProperties(prefix = "personinfo")，
 *    设置 `prefix = "personinfo"` 属性，这样它就可以读取前缀为 `personinfo` 配置项，注入到配置类对应的同名属性上
 *    原理：ConfigurationProperties其实就类似于使用多个 @Value 对 PersonInfo 对象同名属性同时绑定
 */
@Configuration
public class GetPersonInfo {
    @Bean(name = "personInfo")
    @ConfigurationProperties(prefix = "personinfo")
    public PersonInfo personInfo() {
        return new PersonInfo();
    }
}
