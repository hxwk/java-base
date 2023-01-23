package cn.itcast.base.api;

import java.util.Calendar;

/**
 * Author itcast
 * Date 2022/2/28 14:45
 * Desc 实现常见的 Calendar日历的使用
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //通过获取 getInstance 来获取一个 Calendar 对象
        Calendar calendar = Calendar.getInstance();
        //获取年 月 日
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " " + month + " " + dayOfMonth);
    }
}
