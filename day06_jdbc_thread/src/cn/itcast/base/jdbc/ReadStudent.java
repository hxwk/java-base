package cn.itcast.base.jdbc;

import java.sql.*;

/**
 * Author itcast
 * Date 2022/3/3 11:15
 * 实现读取mysql数据库中 t_student 表的值
 * 将其封装到 Student 类对象中
 * 并将其打印输出
 * 开发步骤：
 * 1.创建对象 Student 要 t_student 表一一对应上
 * 表字段 => 成员变量   表字段类型 => 成员变量的类型
 * 每个对象  => 表的每一条记录
 * 2.加载 mysql 的驱动
 * 3.获取连接mysql的连接 Connection
 * 4.创建 statement 对象
 * 5.生成结果集 ResultSet
 * 6.遍历ResultSet 结果集
 * 7.如果存在记录，读取每个字段并将其封装到 Student 对象中
 * 8.打印出每行记录
 * 9.关闭结果集、statement、数据库连接
 */
public class ReadStudent {
    public static void main(String[] args) {
        //1.创建对象 Student 要 t_student 表一一对应上
        // 表字段 => 成员变量   表字段类型 => 成员变量的类型
        // 每个对象  => 表的每一条记录
        //2.加载 mysql 的驱动
        try {
            Connection conn = JDBCUtils.getConn();
            //4.创建 statement 对象
            Statement stmt = conn.createStatement();
            //executeQuery(sql) :执行查询语句，返回 resultset 结果集
            //executeUpdate(sql):执行更新、删除、插入语句返回影响的行数
            //5.生成结果集 ResultSet
            ResultSet rs = stmt.executeQuery("select sid,sname from t_student");
            //6.遍历ResultSet 结果集
            // rs.next() : 是否有下一行记录的值，如果有 true ，否则为 false
            while (rs.next()) {
                //7.如果存在记录，读取每个字段并将其封装到 Student 对象中
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                Student s = new Student(sid, sname);
                //8.打印出每行记录
                System.out.println(s);
            }
            //9.关闭结果集、statement、数据库连接
            JDBCUtils.close(conn,stmt,rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
