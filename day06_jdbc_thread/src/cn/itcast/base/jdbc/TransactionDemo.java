package cn.itcast.base.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author itcast
 * Date 2022/3/3 16:20
 * Desc 模拟张三给李四转账这个事情
 * 要求转账要么都成功要么都失败
 */
public class TransactionDemo {
    public static void main(String[] args) {
        //1.获取连接 Connection
        Connection conn = JDBCUtils.getConn();
        Statement stmt = null;
        try {
            //2.关闭自动提交事务
            //默认情况下 mysql 是自动提交事务的 AutoCommit = true
            conn.setAutoCommit(false);
            //获取 statement
            stmt = conn.createStatement();
            //3.执行张三的账号 - 1000 的操作
            int rows1 = stmt.executeUpdate("update account set money=money-1000 where name='jack'");
            //4.抛出一个异常，报个错。
            System.out.println(1 / 0);
            //5.执行李四的账号 + 1000 的操作
            int rows2 = stmt.executeUpdate("update account set money=money+1000 where name='rose'");
            //6.处理张三和李四两个人的执行情况都要影响，提交成功
            if(rows1 > 0 && rows2 >0){
                System.out.println("转账1000成功！");
                //7.手动提交事务
                conn.commit();
            }else{
                System.out.println("转账失败，请检查！");
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("转账失败请检查！");
            try {
                //8.如果出现异常，给回滚机制
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                JDBCUtils.close(conn,stmt,null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
