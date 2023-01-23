package cn.itcast.base.demo02;

/**
 * Author itcast
 * Date 2022/2/24 15:46
 * Desc TODO
 */
public class VariableDemo {
    public static void main(String[] args) {
        //数字默认是 int 类型
        //byte 字节
        byte a = 127;
        //short 二个字节
        short b = 32767;
        //int 四个字节
        int c = 222222222;
        //long 八个字节
        long d = 111111111111111111L;
        //float 四个字节，默认小数是 double 类型
        float e = 3.14f;
        //double 八个字节，双精度
        double f = 3.14;
        //char 字符，二个字节
        char g = 'a';
        //boolean 布尔类型
        boolean flag = true;

        //数组
        int[] arr = new int[5];
        // 在堆中创建一个区域用于保存这些值
        A a1 = new A();
    }
    public static class A{

    }
}
