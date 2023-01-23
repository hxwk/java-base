package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 10:24
 * Desc 需求 - 打印 0~5和 5~0语句
 * for 循环格式
 * for(初始化条件;判断条件;控制条件){
 * 循环体;
 * }
 */
public class ForDemo {
    public static void main(String[] args) {
        //开发步骤：
        //1.循环打印0~5之间的数字
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();
        //2.循环打印 5~0之间的数字
        for (int i = 0; i <= 5; i++) {
            System.out.println(5 - i);
        }
    }
}
