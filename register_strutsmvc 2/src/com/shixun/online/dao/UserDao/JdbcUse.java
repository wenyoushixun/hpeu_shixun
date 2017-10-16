package com.shixun.online.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shixun.online.model.User;

public class JdbcUse {

	private static String url = "jdbc:mysql://localhost:3306/db_user";

	private static String user = "root";

	private static String password = "root";

	private static String driver = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {

		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("未找到驱动包");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("获取连接失败");
		}
		return connection;
	}

	public static void closeConnection(ResultSet resultSet, PreparedStatement statement, Connection connection)
			throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}

		if (statement != null) {
			statement.close();
		}

		if (connection != null) {
			connection.close();
		}
	}

	/**
	 * 注册时向数据库添加数据
	 * 
	 * @throws SQLException
	 */
	public User insert(User user) throws SQLException {

		// 获取连接
		Connection connection = getConnection();

		// 准备SQL语句
		StringBuffer insertSQL = new StringBuffer();
		insertSQL.append("INSERT INTO t_user (username, password,repeatPassword,email,gender,profession,hobby) ");
		insertSQL.append("VALUES (?,?,?,?,?,?,?)");

		PreparedStatement insertStatement = connection.prepareStatement(insertSQL.toString());
		insertStatement.setString(1, user.getUsername());
		insertStatement.setString(2, user.getPassword());
		insertStatement.setString(3, user.getRepeatPassword());
		insertStatement.setString(4, user.getEmail());
		insertStatement.setString(5, user.getGender());
		insertStatement.setString(6, user.getProfession());
		insertStatement.setString(7, user.getHobby());

		// 执行SQL语句
		int result = insertStatement.executeUpdate();

		System.out.println("执行结果-> 受影响行数：" + result);

		// 关闭连接
		closeConnection(null, insertStatement, connection);
		return user;
	}

	/**
	 * SQL查询
	 */
	public User query(String username, String password) {
		User user = new User();
		// 获取连接
		Connection connection = getConnection();
		try {
			// 准备CRUD语句
			String sql = "SELECT username,password FROM t_user WHERE username=?";

			PreparedStatement query = connection.prepareStatement(sql);

			query.setString(1, username);

			// 执行CRUD语句
			ResultSet result = query.executeQuery();

			while (result.next()) {

				String name = result.getString("username");
				String userpassword = result.getString("password");
				user.setUsername(name);
				user.setPassword(userpassword);

				return user;

			}

			// 关闭连接
			closeConnection(result, query, connection);
			return null;

		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("获取MySQL连接失败！");
			return null;
		}

	}
	
	public User selecter(String username) {
		User user = new User();
		// 获取连接
		Connection connection = getConnection();
		try {
			// 准备CRUD语句
			String sql = "SELECT username FROM t_user WHERE username=?";

			PreparedStatement query = connection.prepareStatement(sql);

			query.setString(1, username);

			// 执行CRUD语句
			ResultSet result = query.executeQuery();

			while (result.next()) {

				String name = result.getString("username");				
				user.setUsername(name);				
				return user;

			}

			// 关闭连接
			closeConnection(result, query, connection);
			return null;

		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("获取MySQL连接失败！");
			return null;
		}
	}
}
