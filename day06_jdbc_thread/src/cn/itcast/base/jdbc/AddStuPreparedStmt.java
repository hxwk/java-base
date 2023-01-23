package cn.itcast.base.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author itcast
 * Date 2022/3/3 15:14
 * Desc TODO
 */
public class AddStuPreparedStmt {
    public static void main(String[] args) throws SQLException {
        //1.获取数据库的连接
        Connection conn = JDBCUtils.getConn();
        //2.创建Statement
        String sql = "insert into t_student(sid,sname) values(?,?)";
        //3.执行插入更新操作
        PreparedStatement stmt = conn.prepareStatement(sql);
        //?? 从 1 开始
        stmt.setInt(1,5);
        stmt.setString(2,"Jack Ma");
        int lines = stmt.executeUpdate();
        if (lines > 0) {
            System.out.println("插入数据表成功，影响的行数为：" + lines);
        }
        //4.关闭连接
        JDBCUtils.close(conn, stmt, null);
    }
}
