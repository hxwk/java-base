package cn.itcast.base.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author itcast
 * Date 2022/3/3 15:14
 * Desc TODO
 */
public class AddStudent {
    public static void main(String[] args) throws SQLException {
        //1.获取数据库的连接
        Connection conn = JDBCUtils.getConn();
        //2.创建Statement
        Statement statement = conn.createStatement();
        //3.执行插入更新操作
        String sql = "insert into t_student(sid,sname) values(4,'xiaohua')";
        int lines = statement.executeUpdate(sql);
        if (lines > 0) {
            System.out.println("插入数据表成功，影响的行数为：" + lines);
        }
        //4.关闭连接
        JDBCUtils.close(conn,statement,null);
    }
}
