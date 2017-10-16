/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shixun.online.model.User;
import com.shixun.online.utils.JDBCUtils;

public class UserDao {

    /**
     * 用户登录
     * @return
     */
    public User getUser() {
        // 通过连接去查询数据库是否有用户 zhangsan，并且密码是否为123

        // 假如查询到了数据zhangsan、123
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        return user;
    }

    /**
     * 增加用户
     */
    public int addUser(User user) {

        int count = 0;
        // 定义数据库的链接  
        Connection connection = null;

        // 定义sql语句的执行对象  
        PreparedStatement pstmt = null;

        // 定义查询返回的结果集合
        ResultSet resultSet = null;
        try {
            // 得到数据库连接
            connection = JDBCUtils.getConnection();
            // 准备 sql 语句
            pstmt = connection.prepareStatement("INSERT INTO t_user (username,password,phone,age,address) VALUES (?,?,?,?,?);");

            // 动态添加参数
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getPhone());
            pstmt.setInt(4, user.getAge());
            pstmt.setString(5, user.getAddress());

            // 执行语句并得到影响的条数
            // 注意：这里如果是查询，需要使用 executeQuery 方法，调用这个方法执行 sql 语句会返回一个 ResultSet 对象
            count = pstmt.executeUpdate();

        } catch (Exception e) {

            // 出现异常，打印错误到控制台
            e.printStackTrace();
        } finally {
            // 无论如何，最后都需要关闭数据库连接
            JDBCUtils.close(resultSet, pstmt, connection);
        }
        return count;

    }

    /**
     * 这个 main 方法用来测试方法的运行
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        user.setAddress("贵州");
        user.setUsername("lisi");
        user.setAge(11);
        user.setPhone("123123123123");
        user.setPassword("123");
        UserDao dao = new UserDao();
        dao.addUser(user);
    }

    /**
     * 删除用户
     */
    public void deleteUser() {
        // 连接数据库
        // 删除数据
        // 关闭数据库连接
        System.out.println("删除了用户");
    }

    /**
     * 修改用户
     */
    public void updateUser() {
        System.out.println("修改了用户");
    }

    /**
     * 查询用户
     */
    public void findUser() {
        System.out.println("查找了用户");
    }

}
