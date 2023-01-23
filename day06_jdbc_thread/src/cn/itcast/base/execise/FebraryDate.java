package cn.itcast.base.execise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/3/3 8:52
 * Desc 二月份有多少天
 */
public class FebraryDate {
    public static void main(String[] args) {
        //用户录入年份
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        //使用 Calendar 日历工具类
        Calendar instance = Calendar.getInstance();
        //获取 3月1号
        instance.set(year,2,1);
        //时间向前推一天 ， 年-月-日
        instance.add(Calendar.DAY_OF_MONTH,-1);
        //拿到天
        int day = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
