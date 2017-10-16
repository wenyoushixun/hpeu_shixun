/********************************************
 * Copyright (c) 2016, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package com.shixun.online.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库连接工具类
 */
public class JDBCUtils {

    // 连接数据库的 url
    //    private String url = "jdbc:mysql://localhost:3306/jdbc";
    private static String url = "jdbc:mysql://localhost:3306/db_mysql?useUnicode=true&characterEncoding=utf-8";

    // 数据库用户名
    private static String user = "root";

    // 数据库密码
    private static String password = "123456";

    // jdbc 驱动
    private static String driver = "com.mysql.jdbc.Driver";

    /**
     * 获得数据库连接
     * @return 数据库连接
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 注册驱动
            Class.forName(driver);
            // 获取连接
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            // 创建数据库连接异常的处理
            System.out.println("创建数据库连接异常");
        }
        return conn;
    }

    /**
     * 关闭数据库连接，释放资源
     * @param resultSet ResultSet
     * @param statement Statement
     * @param connection Connection
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        // 如果 resultSet 不为 null，关闭 resultSet
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // 如果 statement 不为 null，关闭 statement
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // 如果 connection 不为 null，关闭 connection
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
