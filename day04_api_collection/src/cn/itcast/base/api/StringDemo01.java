package cn.itcast.base.api;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        //1.从控制台获取一个字符串
        Scanner scanner = new Scanner(System.in);
        //2.打印输出这个字符串
        String str = scanner.next();
        System.out.println(str);
        //3.将字符串转换成字符数组
        char[] chars = str.toCharArray();
        //4.变量打印输出每个字符
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            //获取这字符数组的每个字符
            System.out.print(chars[i]+ " ");
            //获取字符串指定位置上的字符
            System.out.print(str.charAt(i)+" ");
            //System.out.print(chars[i]+1 + " ");
        }
        //5.每个字符加1
    }
}