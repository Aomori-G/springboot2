package com.cxq.demo.pojo;

import lombok.Data;

/**
 * 使用lombok注解，简化代码
 * @Data：自动生成 Getter/Setter、toString、equals、hashCode 方法，以及不带参数的构造方法
 */
@Data
public class user {
    private String name;
    private Integer age;

    /**
     * 1.使用快捷键 Alt + Enter，选注入语言或引用 Inject language or reference
     * 2.搜索 json 并选择（也可以选其他语言），然后使用快捷键 Alt + Enter 自动选定语言
     * 3.再使用快捷键 Alt + Enter，选 Edit JSON Fragment 开启编辑 JSON语法文件 的视图
     *                         选 Uninject language or reference 取消注入，恢复String输入
     * 测试如下：
     */
    //language=JSON
    String testJson = "{\"member\": [{\n" +
            "  \"name\":" +
            "\"小明\",\"age\": 23\n" +
            "},{\n" +
            "  \"name\":" +
            "  \"pegasus\",\"age\": 24\n" +
            "}]}";
    //language=HTML
    String testHtml = "<p>Hello StringHtml</p>";
}
