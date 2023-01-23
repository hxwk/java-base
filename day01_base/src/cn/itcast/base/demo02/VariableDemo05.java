package cn.itcast.base.demo02;

/**
 * Author itcast
 * Date 2022/2/24 16:41
 * Desc TODO
 */
public class VariableDemo05 {
    public static void main(String[] args) {
        //1.定义两个int类型的变量a和b, 分别赋值为10, 20.
        int a = 10, b = 20;
        //2.通过输出语句打印变量a和b的和.
        System.out.println(a + " " + b);
        //3.定义int类型的变量c, 接收变量a和b的和.
        int c = a + b;
        //4.打印变量c的值.
        System.out.println(c);
        //5.定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
        int aa = 1;
        // -128 ~ 127
        byte bb = 2;
        //6.定义变量cc接收 变量aa和bb的和. byte + int = int类型
        //int cc = aa + bb;
        //分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.
        byte cc = (byte)(aa + bb);
        System.out.println(cc);
        //字符和 int 之间的转换
        char dd = 'A';
        int dd1 = dd;
        System.out.println("字符对应的十进制："+dd1);
        //字符串和数值能不能转换
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
        //数值转换成字符串
        int num2 = 100;
        String num2Str = String.valueOf(num2);
        String num3Str = num2 + "";
    }
}
