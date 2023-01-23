package cn.itcast.base.iostream;

import java.util.Arrays;

/**
 * Author itcast
 * Date 2022/3/1 17:19
 * Desc TODO
 */
public class Solution {
    public static void main(String[] args) {
        String s ="91 27 45 38 50";
        //1.切割字符串，将其转换成数组
        String[] arr = s.split(" ");
        //2.通过 Arrays 进行正向排序
        Arrays.sort(arr);
        //3.拼接字符串成 27,38,...
        StringBuilder builder = new StringBuilder();
        for (String string : arr) {
            builder.append(string)
                    .append(", ");
        }
        //4.将其打印输出
        String result = builder.deleteCharAt(builder.length()-2).toString();
        System.out.println(result);
    }
}
