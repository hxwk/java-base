package cn.itcast.base.api;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/28 11:15
 * Desc 需求 - 将用户输入的字符串翻转
 */
public class StringReverse {
    public static void main(String[] args) {
        //1.从控制台输入一个字符串
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        //2.编写一个字符串翻转的方法
        String next = sc.next();
        //3.调用翻转字符串的方法，并打印输出
        /*String reverse = reverse(next);
        System.out.println(reverse);*/
        String reverse = reverse(next, new StringBuilder());
        System.out.println(reverse);
    }

    /**
     * 输入 abc 返回 cba
     * @param str
     * @return
     */
    public static String reverse(String str){
        //将字符串转换成字符数组
        char[] chars = str.toCharArray();
        //定义一个字符串用于拼接字符
        String reverseStr = "";
        //倒序显示每个字符，将其拼接成字符串
        for (int i = chars.length - 1; i >=0; i--) {
            reverseStr += chars[i];
        }
        //返回字符串
        return reverseStr;
    }

    //互为重载方法
    public static String reverse(String str,StringBuilder builder){
        StringBuilder stringBuilder = builder.append(str);
        //StringBuilder 有一个翻转的工具类
        String s = stringBuilder.reverse().toString();
        return s;
    }
}
