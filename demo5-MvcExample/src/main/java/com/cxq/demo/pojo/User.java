package com.cxq.demo.pojo;

import lombok.Data;

@Data
public class User {
    //定义 id
    private long id;
    //定义用户名
    private String name;
    //定义用户年龄
    private int age;
}
