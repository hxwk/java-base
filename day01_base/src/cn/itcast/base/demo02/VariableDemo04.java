package cn.itcast.base.demo02;

/**
 * Author itcast
 * Date 2022/2/24 16:22
 * Desc TODO
 */
public class VariableDemo04 {
    static int a = 10;

    public static void main(String[] args) {
        //第一种变量定义的方式
        //int a = 20;
        System.out.println("a is: "+ a);
        //第二种变量定义的方式
        int b ;
        b = 12;
        System.out.println(b);

        //查看作用范围
        {
            int c = 10;
            System.out.println(c);
        }
        //System.out.println(c);
    }
}
