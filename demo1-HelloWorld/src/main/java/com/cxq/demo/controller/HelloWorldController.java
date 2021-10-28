package com.cxq.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController：相当于 @Controller 和 @ResponseBody 的组合，代表这个类是 REST 风格的控制器
 */
@RestController
public class HelloWorldController {
    /**
     * @RequestMapping：配置 接口(API) 信息
     * value属性：接口路径的别名
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello,Spring Boot!";
    }
}
