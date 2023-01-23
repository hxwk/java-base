package cn.itcast.base.arr;

/**
 * Author itcast
 * Date 2022/2/25 14:26
 * 数组定义方式：
 * 1.动态定义
 * 数据类型[] 数组名称 = new 数据类型[10];
 * 数据类型代表的是这一组数据的类型
 * [] 代表的是当前是数组
 * 10: 代表当前的数组长度为 10
 *
 * 2.静态定义
 * 数据类型[] 数组名称 = {元素1，元素2，元素3...};
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个动态分配的数组

        int[] arr = new int[10];

       /* for (int i : arr) {
            System.out.println(i);
        }*/

        boolean[] farr = new boolean[5];
        for (boolean v : farr) {
            System.out.println(v);
        }


        int arr2[] = new int[10];
        //定义一个静态分配的数组
        int[] arr3 = {1,2,3,4,5,6,7,8};

        int[] arr4 = new int[]{1,2,3,4,5,6,7,8,9,10};
    }
}
