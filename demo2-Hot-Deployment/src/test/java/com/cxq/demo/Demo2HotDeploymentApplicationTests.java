package com.cxq.demo;

import com.cxq.demo.pojo.PersonInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

/**
 * @SpringBootTest: 用于测试的注解，可指定入口类或测试环境等
 */
@SpringBootTest
class Demo2HotDeploymentApplicationTests {

    //获取配置文件中的age
    @Value("${age}")
    private Integer age;

    //获取配置文件中的name
    @Value("${name}")
    private String name;

    @Autowired
    private PersonInfo personInfo;

    @Test
    public void testAge(){
        System.out.println(age);
    }

    @Test
    public void testName(){
        System.out.println(name);
    }

    @Test
    public void testPersonInfo(){
        System.out.println(personInfo);
    }
}
