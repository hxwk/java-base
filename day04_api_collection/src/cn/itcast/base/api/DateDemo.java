package cn.itcast.base.api;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author itcast
 * Date 2022/2/28 14:31
 * Desc 需求 -
 * 1.获取当前系统的时间，并将其转换成 yyyy-MM-dd HH:mm:ss 格式
 * 2.指定一个时间戳，打印输出指定的时间
 */
public class DateDemo {
    public static void main(String[] args) {
        //创建格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        //获取当前的系统时间，通过无参构造
        Date date = new Date();
        //打印输出当前的时间戳
        System.out.println(date.getTime());
        String currentTimeStr = sdf.format(date);
        System.out.println(currentTimeStr);

        //设置一个任意的时间戳
        date.setTime(1646030085000L);
        //打印输出这个时间的字符串
        String format = sdf.format(date);
        System.out.println(format);
    }
}
