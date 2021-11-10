package com.cxq.demo.controller;

import com.cxq.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HelloWorldMvcController {
    //方法的URL映射路径（Restful 风格的API）
    @RequestMapping("/helloworld")
    public String hello(Model model){
        model.addAttribute("mav","Hello,Spring Boot MVC 结构！");
        User user = new User("tom", 23,new Date(1232431231L));
        model.addAttribute("user",user);
        //视图（view）的位置和名称。视图位于 example 文件夹下，视图文件为 hello.html
        return "example/hello";
    }

    //编写hello.html访问其他页面API
    @RequestMapping("/helloworld2")
    public String hello2(Model model){
        return "example/a";
    }
}