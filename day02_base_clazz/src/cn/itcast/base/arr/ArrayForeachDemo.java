package cn.itcast.base.arr;

/**
 * Author itcast
 * Date 2022/2/25 15:54
 * Desc 遍历数组
 * 1.定义int类型的数组arr, 存储元素11, 22, 33, 44, 55.
 */
public class ArrayForeachDemo {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        //1. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            ///System.out.println(arr[i]);
        }
        //2. foreach
        /**
         * 增强 for 循环
         * for(元素的类型 变量 : 集合){
         *  语句块;
         * }
         */
        for(int element : arr){
            System.out.println(element);
        }
    }
}
