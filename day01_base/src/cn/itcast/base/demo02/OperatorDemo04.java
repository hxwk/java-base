package cn.itcast.base.demo02;

public class OperatorDemo04 {
    public static void main(String[] args) {
        //定义三元运算符
        // (逻辑表达式) ? 表达式1 : 表达式2
        int a = 10;
        int b = 20;
        //求最大值
        int max = a > b ? a : b;

        System.out.println(max);
        //如果a>b 2*a 如果 b>a b*b
        int result = a > b ? 2 * a : b * b;
        System.out.println(result);
    }
}