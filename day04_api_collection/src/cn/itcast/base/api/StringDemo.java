package cn.itcast.base.api;

/**
 * Author itcast
 * Date 2022/2/28 10:46
 * 定义字符数组chs, 初始化值为: 'a, 'b', 'c', 这三个字符 .
 * 将其分别封装成s1, s2这两个字符串对象.
 * 直接通过""的方式创建两个字符串对象s3和s4.
 * 通过==分别判断s1和s2, s1和s3, s3和s4是否相同.
 * 通过equals()分别判断s1和s2, s1和s3, s3和s4是否相同.
 * 通过equalsIgnoreCase()判断字符串abc和ABC是否相同.
 */
public class StringDemo {
    public static void main(String[] args) {
        //定义字符数组chs, 初始化值为: 'a, 'b', 'c', 这三个字符 .
        char[] chars = {'a','b','c'};
        //将其分别封装成s1, s2这两个字符串对象.
        String s1 = new String(chars);
        String s2 = new String(chars);
        //直接通过""的方式创建两个字符串对象s3和s4.
        String s3 = "abc";
        String s4 = "abc";
        //通过==分别判断s1和s2, s1和s3, s3和s4是否相同.
        /*System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);*/
        //通过equals()分别判断s1和s2, s1和s3, s3和s4是否相同.
        //判断字符串内容的时候，需要使用 字符串1.equals(字符串2) 进行判断两个字符串内容是否相等。
        /*System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));*/
        //通过equalsIgnoreCase()判断字符串abc和ABC是否相同.
        System.out.println("abc".equalsIgnoreCase("ABC"));
    }
}
