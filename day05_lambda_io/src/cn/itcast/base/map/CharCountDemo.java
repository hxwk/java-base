package cn.itcast.base.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Author itcast
 * Date 2022/3/1 10:16
 * Desc 键盘录入“aababcabcdabcde” 在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class CharCountDemo {
    public static void main(String[] args) {
        //1.从控制台读取一行字符串
        System.out.println("请输入一串字符");
        Scanner sc = new Scanner(System.in);
        //2.创建TreeMap，用于接收每个字符和次数
        Map<Character, Integer> charMap = new TreeMap<>();
        //3.将一行字符串转换成字符数组
        char[] chars = sc.next().toCharArray();
        //4.遍历这个字符数组
        for (char aChar : chars) {
            //如果当前这个字符数组中包含这个字符
            /*if(charMap.containsKey(aChar)){
                charMap.put(aChar,charMap.get(aChar)+1);
            }else{ //否则的话，说明当前TreeMap中没有这个字符，那么就给当前的字符  字符 -> 1
                charMap.put(aChar,1);
            }*/
            if (!charMap.containsKey(aChar)) {
                charMap.put(aChar, 1);
            } else {
                charMap.put(aChar, charMap.get(aChar) + 1);
            }
        }

        //定义 StringBuilder
        StringBuilder builder = new StringBuilder();
        //遍历TreeMap然后拼接成a(5)b(4)c(3)d(2)e(1)
        for (Character key : charMap.keySet()) {
            builder.append(key)
                    .append("(")
                    .append(charMap.get(key))
                    .append(")");
        }
        //6.打印结果
        String str = builder.toString();
        System.out.println(str);
    }
}
