package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/26 8:41
 * Desc 水仙花：
 * 1.必须是三位数 100~999
 * 2.每个数的个位、十位、百位，立方之和等于这个数本身
 * 123 是否相等 1^3+2^3+3^3
 * 需求 - 求出所有的水仙花数，并将100~1000之间的所有水仙花的个数打印输出
 * 开发步骤：
 * 1.循环遍历 100~1000之间的所有的数
 * 2.求出个位、十位、百位 三个数
 * 3.将三个数字的立方求和
 * 4.将这个和当前这个数判断是否相等，如果相等就将当前的数打印输出，同时计数 +1
 */
public class WaterFlowerDemo {
    private int age;
    public static void main(String[] args) {

        String[] arr = new String[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int count = 0;
        //1.循环遍历 100~1000之间的所有的数
        for (int i = 100; i < 1000; i++) {
            //2.求出个位、十位、百位 三个数
            int unit = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;
            //3.将三个数字的立方求和
            int sum = unit * unit * unit + tens * tens * tens + hundreds * hundreds * hundreds;
            //4.将这个和当前这个数判断是否相等，如果相等就将当前的数打印输出，同时计数 +1
            if(sum == i){
                System.out.println("当前数字是水仙花数："+i);
                count++;
            }
        }
        System.out.println("当前100~1000范围内有水仙花："+count);
    }
}
