package cn.itcast.base.arr;

/**
 * Author itcast
 * Date 2022/2/25 14:40
 * Desc
 * 需求 - 基本的数组操作
 * 数组中增加/修改数据
 * 数组中获取数据
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义一个 int 类型的数组
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        //打印输出
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        //获取数组中指定位置的数据
        //数组名[index]
        System.out.println(arr[4]);

        //获取数组的长度
        System.out.println(arr.length);
    }
}
