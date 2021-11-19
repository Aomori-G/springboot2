package com.cxq.demo.controller;

import com.cxq.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemoController {
    //映射 URL 地址
    @GetMapping("mvcdemo")
    public ModelAndView hello(){
        //实例化对象
        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);
        //定义 MVC 中的视图模板
        ModelAndView mav = new ModelAndView("mvcdemo");
        //传递 user 实体对象给视图
        mav.addObject("user",user);
        return mav;
    }
}