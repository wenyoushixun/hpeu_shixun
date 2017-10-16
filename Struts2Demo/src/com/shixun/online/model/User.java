/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.model;

/**
 * Model 表示数据模型，也就是俗称的实体类
 * 
 * 只包含属性和对应的 get、set 方法（还会有一些辅助的方法），不能包含业务（功能）代码
 */
public class User {

    // 用户名
    private String username;

    // 密码
    private String password;

    // 电话
    private String phone;

    // 年龄
    private int age;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
