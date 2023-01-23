package cn.itcast.base.demo02;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/24 17:40
 * Desc 从控制台获取三个和尚的身高，从而判断哪个和尚是最高的，最高多少
 */
public class HeightMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //获取三个和尚的身高
        System.out.println("请输入第一个和尚身高：");
        int first = sc.nextInt();
        System.out.println("请输入第二个和尚身高：");
        int second = sc.nextInt();
        System.out.println("请输入第三个和尚身高：");
        int third = sc.nextInt();
        //比较三个和尚的身高
        int tmp = first >= second ? first : second;
        int max = tmp >= third ? tmp : third;
        //打印输出最高的和尚的身高
        System.out.println("最高的身高为：" + max);
    }
}
