package com.cxq.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/echo")
    public String echo(){
        /**
         * 不关闭或重启springboot程序，将 return "echo" 修改为 return "none"，浏览器访问
         * 1. 只添加 spring-boot-devtools 依赖需要重新编译程序，即 Build -> Build Project（Ctrl + F9）
         * 2. IDEA自动编译，File -> Settings -> Build,Execution,Deployment -> Compiler
         *    -> Build project automatically，只支持 Debugger 模式，不支持运行模式
         * 3. IDEA自带热部署插件，File | Settings | Build, Execution, Deployment | Debugger | HotSwap，
         *    可能还是需要重新编译程序
         * 4. 在 Run/Debug Configuration 中，选中要配置的 Spring Boot 程序
         *    在 On 'update' action 和 On frame deactivation，配置 Update classes and resources，实现自动编译
         */
        return "none";
    }
}
