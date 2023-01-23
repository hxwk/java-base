package cn.itcast.base.api;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/28 10:03
 * Desc 需求 - 从控制台打印输出用户输入的文本
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数类型：");
        int i = sc.nextInt();
        //打印输出
        System.out.println(i);
    }
}
