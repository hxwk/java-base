package cn.itcast.base.structure;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/25 10:04
 * Desc 需求 - 用户输入一个月份，返回季节，其中 12 1 2为冬季；3 4 5为春季； 6 7 8为夏季； 9 10 11位秋季
 * switch...case格式
 * switch(表达式){
 *     case 值1:
 *        语句体1;
 *        break;
 *     case 值2:
 *        语句体2;
 *        break;
 *     case 值3:
 *        语句体3;
 *        break;
 *        ...
 *     default:
 *         语句体n;
 *         break;
 * }
 */
public class StructureDemo3 {
    public static void main(String[] args) {
        //开发步骤：
        //从控制台输入一个数字，月份
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        //通过switch ... case ... 判断是什么季节
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份不对");
                break;
        }
        //打印输出值
    }
}
