package cn.itcast.base.demo02;

public class OperatorDemo03 {
    public static void main(String[] args) {
        //1. 定义两个int类型的变量a和b, 初始化值分别为: 2, 5
        int a = 2, b = 5, c = 6;
        //2. 演示逻辑与(&)
        //单 & ，会执行两个表达式
        /*System.out.println((a++ > 2) & (b++ < 7)); //两个表达式都会执行.
        System.out.println(a);
        System.out.println(b);
        System.out.println("------------------");*/

        //3. 演示短路与(&&) 双 &
        /*System.out.println((a++ > 2) && (b++ < 7)); //左边表达式结果为false, 右边不执行.
        System.out.println(a);
        System.out.println(b);*/

        //4. 短路或 ||
        System.out.println((a++ > 2) || (b++ < 7) || (--c == 5));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}