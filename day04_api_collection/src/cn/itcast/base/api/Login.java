package cn.itcast.base.api;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/28 10:53
 * 模拟用户登录, 只给3次机会, 登录成功则提示"欢迎您, ***".
 * 登录失败则判断是否还有登录机会, 有则提示剩余登录次数2-i, 没有则提示"您的账号已被锁定".
 * 假设初始化账号和密码分别为: "传智播客", "黑马程序员".
 */
public class Login {
    public static void main(String[] args) {
        //开发步骤
        //1.初始化用户名和密码
        final String USER = "传智播客";
        final String PASSWORD = "黑马程序员";
        //2.从控制台获取用户输入的账号和密码
        Scanner sc = new Scanner(System.in);
        //定义一个变量用于接收是否超过3次登录
        int count = 0;
        //3.循环3次判断是否登录成功，登录成功返回欢迎您
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String user = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            //判断是否和保存的用户名和密码相等
            if (user.equals(USER) && password.equals(PASSWORD)) {
                System.out.println("登录成功，欢迎您...");
                break;
            } else {
                //如果登录失败，就需要判断当前的登录次数是否超过3，超过3就显示账号被锁定
                //否则继续登录并显示剩余登录次数
                if (count < 2) {
                    System.out.println("登录失败，剩余登录次数："+ (2-i));
                    count ++;
                }else{
                    System.out.println("您的账号已被锁定");
                    break;
                }
            }
        }
    }
}
