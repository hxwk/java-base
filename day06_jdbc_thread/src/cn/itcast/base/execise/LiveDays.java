package cn.itcast.base.execise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/3/3 9:01
 * Desc 根据用户输入的年月日，计算出来到当前时间有多少天
 */
public class LiveDays {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //时间戳（毫秒）
        System.out.println(new Date().getTime());
        //1.获取用户输入的年、月、日
        System.out.println("请输入年");
        int year = sc.nextInt();
        System.out.println("请输入月");
        int month = sc.nextInt();
        System.out.println("请输入日");
        int day = sc.nextInt();
        //2.拼接成时间字符串并转换成日期 Date
        String dateStr = year + "-" + month + "-" + day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = DateUtils.string2Date(dateStr);
        //3.获取当前时间的日期 - 2步得到的日期
        //getTime() 获取当前时间戳 long
        //4.将日期的差值/1000/3600/24
        long dates = (new Date().getTime() - date.getTime()) / 1000 / 3600 / 24;
        //5.打印输出天数
        System.out.println(dates);
    }
}
