package cn.itcast.base.demo02;

/**
 * Author itcast
 * Date 2022/2/24 17:09
 * Desc TODO
 */
public class VariableDemo06 {
    public static void main(String[] args) {
        // ++ -- 是Java的算数运算符
        // ++  加1并赋值或先赋值再加一
        int a = 3;
        //如果 ++ 放在变量之后，先赋值再加 1
        /**
         * int b = a++ 等价于
         * int b = a;
         * a = a + 1;
         */
        int b = a++;
        //此时这个 a = 4
        System.out.println(b);
        //如果 ++ 放在变量之前，先加1 再赋值
        // c = 4 + 1
        /**
         *
         * int c = ++a 等价于
         * a = a + 1;
         * int c = a;
         */
        int c = ++a;
        // 5
        System.out.println(c);
        System.out.println(a);
    }
}
