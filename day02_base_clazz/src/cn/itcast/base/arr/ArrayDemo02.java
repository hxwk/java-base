package cn.itcast.base.arr;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //1. 定义一个长度为5的int类型的数组.
        int[] arr = new int[5];
        //2. 打印数组中的第3个元素.
        System.out.println(arr[2]);
        //3. 设置数组中的第一个元素值为11.
        arr[0] = 11;
        //4. 获取数组中的第一个元素值, 并将其赋值给变量a, 然后打印.
        int a = arr[0];
        System.out.println(a);
        //5. 打印数组的长度.
        System.out.println(arr.length);
    }
}