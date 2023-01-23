package cn.itcast.base.structure;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/25 11:27
 * 需求：
 * 1.生成一个1-100之间的随机数, 让用户来猜.
 * 2.如果猜的数字比生成的随机数大，提示你猜的数据大了
 * 3.如果猜的数字比生成的随机数小，提示你猜的数据小了
 * 4.如果猜的数字与生成的随机数相等，提示恭喜你猜中了
 * <p>
 * 知识点：
 * 1.死循环 while(true)
 * 2.用户输入数字 Scanner 控制台输入
 * 3.判断 if
 * 4.循环跳转 break continue
 * 5.随机数 Math.random
 */
public class GuessDemo {
    public static void main(String[] args) {
        //开发步骤：
        Scanner sc = new Scanner(System.in);
        //2.获取 1~100之间的随机数
        int random = (int) (Math.random() * 100 + 1);
        //1.获取用户输入的控制台数字
        while (true) {
            System.out.println("请输入数字：");
            int guess = sc.nextInt();
            //3.判断输入的值和随机数谁大谁小
            if (guess > random) {
                System.out.println("提示你猜的数据大了");
            } else if (guess < random) {
                System.out.println("提示你猜的数据小了");
            } else {
                //4.打印输出
                System.out.println("提示恭喜你猜中了");
                //5.如果猜中了，就退出
                break;
            }
        }
    }
}
