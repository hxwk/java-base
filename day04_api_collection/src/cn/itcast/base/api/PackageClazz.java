package cn.itcast.base.api;

/**
 * Author itcast
 * Date 2022/2/28 11:44
 * Desc TODO
 */
public class PackageClazz {
    public static void main(String[] args) {
        //将int转换成包装类
        int a = 10;
        Integer integer = new Integer(a);
        System.out.println(integer);
        //将数字字符串转换成数字类型
        Integer integer1 = new Integer("10");
        //获取int类型的最大值和最小值
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("maxValue:" + maxValue + " minValue:" + minValue);

        //将整数类型转换字符串类型
        String s1 = 10 + "";
        //将Integer包装类转换成 int 类型
        int ii = integer1.intValue();

        //自动装箱
        Integer i2 = 10;
        i2 += 20;
        //自动拆箱
        int i3 = i2;
    }
}
