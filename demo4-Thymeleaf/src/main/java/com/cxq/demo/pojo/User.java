package com.cxq.demo.pojo;

import java.util.Date;

public class User {
    private String name;
    private Integer age;
    private Date createTime;

    public User(String name, Integer age, Date createTime) {
        this.name = name;
        this.age = age;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
