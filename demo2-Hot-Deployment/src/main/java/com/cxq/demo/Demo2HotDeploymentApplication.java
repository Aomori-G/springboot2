package com.cxq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2HotDeploymentApplication {

    public static void main(String[] args) {
        //自定义 Banner
        /**
         * 1. Spring Boot 应用程序启动时在控制台显示自定义信息，使用 Banner 实现
         *    ① 在 resources 资源目录下创建 banner.txt，输入想要显示的信息即可
         *    ② 使用 banner.gif、banner.jpg、banner.png，图片会被“编译”成对应的 ASCII 字符画图案显示
         *       也可使用字符画图工具(可搜索)生成字符画，保存到 banner.txt 文件
         * 2. 关闭 Banner
         *    ① 修改入口类 main 方法实现
         *      public static void main(String[] args){
         *          SpringApplication sApp = new SpringApplication(Demo2HotDeploymentApplication.class);
         *          //关闭 Banner 模式
         *          sApp.setBannerMode(Banner.Mode.OFF);
         *          sApp.run(args);
         *      }
         *    ② 在 application.yaml 配置文件中关闭 Banner 模式
         *      代码：spring:main:banner-mode:off
         */
        SpringApplication.run(Demo2HotDeploymentApplication.class, args);
    }

}
