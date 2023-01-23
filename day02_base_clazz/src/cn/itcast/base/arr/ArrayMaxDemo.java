package cn.itcast.base.arr;

/**
 * Author itcast
 * Date 2022/2/25 16:02
 * Desc 计算出数组中的最大值
 */
public class ArrayMaxDemo {
    public static void main(String[] args) {
        int[] arr = {5, 15, 2000, 10000, 100, 4000};
        //开发步骤:
        //1.定义变量
        int tmp = arr[0];
        //2.for循环遍历每一位的颜值分数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>tmp){
                //3.与临时区中变量进行比较看谁大
                tmp = arr[i];
            }
        }
        //4.打印输出最大的颜值
        System.out.println(tmp);
    }
}
