package cn.itcast.base.jdbc;

import java.sql.*;

/**
 * Author itcast
 * Date 2022/3/3 14:35
 * Desc 此类是一个工具类，主要用于
 * ① 获取连接数据库的对象 Connection
 * ② 获取关闭数据库的对象 close
 */
public class JDBCUtils {
    //定义常量 url 用户名和密码
    private static final String URL = "jdbc:mysql://node1:3306/day06?useSSL=false&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    //开发步骤

    /**
     * 1.初始化 mysql 或 oracle 的驱动
     * 2.创建获取 Connection 的方法
     * 3.创建关闭 Connection 的方法
     */
    //静态代码块主要用于初始化静态变量，在类被初始化，被装载到内存中。
    //初始化工作 1.初始化 mysql 或 oracle 的驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //2.创建获取 Connection 的方法
    public static Connection getConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //3.创建关闭 Connection 的方法
    public static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) rs.close();
        if (!stmt.isClosed()) stmt.close();
        if (!conn.isClosed()) conn.close();
    }
}
