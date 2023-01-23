package cn.itcast.base.api;

import java.util.Arrays;

/**
 * Author itcast
 * Date 2022/2/28 11:39
 * Desc TODO
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {25, 69, 80, 57, 13};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
