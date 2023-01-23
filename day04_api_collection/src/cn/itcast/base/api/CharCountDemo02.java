package cn.itcast.base.api;

import java.util.Scanner;

public class CharCountDemo02 {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println((int)c);
        /**
         * 1.控制台输入字符串
         * 2.将字符串转换成字符数组
         * 3.遍历字符数组
         * 3.1.判断当前字符是大写字符，计数+1
         * 3.2.判断当前小写字符 计数+1
         * 3.3.判断当前数字字符 计数+1
         * 4.打印输出所有的计数
         */
        //定义大小写数字的统计变量
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        //1.控制台输入字符串
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //2.将字符串转换成字符数组
        char[] chars = str.toCharArray();
        //3.遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            //3.1.判断当前字符是大写字符，计数+1
            if(chars[i]>='A'&& chars[i]<='Z'){
                upperCount ++;
            }else if(chars[i]>='a'&&chars[i]<='z'){
                //3.2.判断当前小写字符 计数+1
                lowerCount ++;
            }else if(chars[i]>='0' && chars[i]<='9'){
                //3.3.判断当前数字字符 计数+1
                numCount++;
            }
        }

        //4.打印输出所有的计数
        System.out.println("大写字符个数："+upperCount);
        System.out.println("小写字符格式："+lowerCount);
        System.out.println("数字字符个数："+numCount);

    }
}