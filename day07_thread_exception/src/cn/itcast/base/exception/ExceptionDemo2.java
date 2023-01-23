package cn.itcast.base.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author itcast
 * Date 2022/3/4 11:32
 * Desc 空指针异常错误
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = null;
        try {
            String format = sdf.format(new Date());
            System.out.println(format);
        } catch (Exception e1) {
            String message = e1.getMessage();
            System.out.println("空指针异常错误 " + message);
            //e1.printStackTrace();
        }
    }
}
