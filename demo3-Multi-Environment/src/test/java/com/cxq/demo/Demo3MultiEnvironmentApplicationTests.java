package com.cxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3MultiEnvironmentApplicationTests {

    @Value("${myenvironment.name}")
    private String name;

    @Test
    public void getMyEnvironment(){
        System.out.println(name);
    }

}
