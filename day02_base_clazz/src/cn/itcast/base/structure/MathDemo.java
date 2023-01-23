package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 11:20
 * Desc 使用Math类，生成5个1~10之间的随机整数, 并将结果打印到控制台.
 */
public class MathDemo {
    public static void main(String[] args) {
        //1.for循环遍历 1~5 个数字
        //2.获取随机整数 1~10之间
        //Math.random() 获取 [0,1) 小数，如何获取 1~10整数
        // [1,11) => double -> int 将一个大的数据类型转换成一个小的数据类型，需要强制类型转换
        //小的数据类型 变量 = (小的数据类型)(大的值)
        int random = (int) (Math.random() * 10 + 1);
        System.out.println(random);
    }
}
