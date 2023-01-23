package cn.itcast.base.api;

/**
 * Author itcast
 * Date 2022/2/28 11:30
 * Desc 创建一个 StringBuilder ，内容 abc
 * 在 abc 追加 cde
 * 在b后面再插入一个 |
 * 打印输出结果
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //1.创建Stringbuilder
        StringBuilder builder = new StringBuilder();
        //2.将 abc 插入到 StringBuilder 中
        builder.append("abc");
        //3.将cde 插入到 abc 中
        builder.append("cde");
        //4.将 b 后插入 | insert
        builder.insert(2,'|');
        //5.转换成字符串并打印输出
        String s = builder.toString();
        System.out.println(s);
    }
}
