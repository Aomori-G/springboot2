package com.cxq.demo.controller;

import com.cxq.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class TestValidator {
    @GetMapping("/test")
    public String showForm(User user){
        return "form";
    }
    @GetMapping("/result")
    public String result(@ModelAttribute("user") User user){
        return "result";
    }
    @PostMapping("/test")
    public String checkUser(@Valid User user, BindingResult bindingResult, RedirectAttributes attr){
        //注意：实体中的属性都必须被验证过，否则不会成功
        if (bindingResult.hasErrors()){
            return "form";
        }
        attr.addFlashAttribute("user",user);
        return "redirect:/result";
    }
}
