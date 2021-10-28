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
}
