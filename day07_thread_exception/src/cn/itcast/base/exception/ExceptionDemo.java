package cn.itcast.base.exception;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/3/4 11:17
 * Desc 需求 - 除零错误；数组越界问题；数字格式异常；其他异常
 * 捕获异常的格式是：
 * try{
 *     实现业务
 * }catch(Exception ex){
 *     打印输出异常
 * }finally{
 *     一定会执行的代码；
 *     释放资源
 * }
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        /**
         * 开发步骤：
         * 1.获取用户输入的值，类似于 10,5
         * 2.将读取到的值通过 , 进行切分得到一个数组
         * 3.数字相除
         * 4.处理异常 除零错误；数组越界问题；数字格式异常；其他异常
         *
         */
        //1.获取用户输入的值，类似于 10,5
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //2.将读取到的值通过 , 进行切分得到一个数组
            String line = sc.next();
            String[] twoNums = line.split(",");

            /*try {
                int aa = Integer.parseInt(twoNums[0]);
                int bb = Integer.parseInt(twoNums[1]);
                //3.数字相除
                int cc = aa / bb;
                System.out.println("两数之除为：" + cc);
            }catch (ArithmeticException e1){
                e1.printStackTrace();
            }catch (IndexOutOfBoundsException e2){
                e2.printStackTrace();
            }catch (NumberFormatException e3){
                e3.printStackTrace();
            }*/

            try {
                int aa = Integer.parseInt(twoNums[0]);
                int bb = Integer.parseInt(twoNums[1]);
                //3.数字相除
                int cc = aa / bb;
                System.out.println("两数之除为：" + cc);
            }catch (Exception e1){
                e1.printStackTrace();
            }
            //4.处理异常 除零错误；数组越界问题；数字格式异常；其他异常
        }

    }
}
