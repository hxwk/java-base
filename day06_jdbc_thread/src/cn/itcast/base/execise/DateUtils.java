package cn.itcast.base.execise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author itcast
 * Date 2022/3/3 8:43
 * Desc 时间的转换，将时间类型转换成字符串类型，将时间字符串类型转换成时间类型
 */
public class DateUtils {

    //定义一个时间格式
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 实现日期类型转换成日期字符串
     * @param date
     * @return 日期字符串
     */
    public static String date2String(Date date){
        String txt = sdf.format(date);
        return txt;
    }

    public static Date string2Date(String dateStr) throws ParseException {
        Date date = sdf.parse(dateStr);
        return date;
    }

    public static void main(String[] args) throws ParseException {
        String s = date2String(new Date());
        System.out.println(s);

        //
        Date date = string2Date("2022-03-04");
        System.out.println(date);
    }
}
