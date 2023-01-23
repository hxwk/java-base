package cn.itcast.base.collection.simple;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author itcast
 * Date 2022/2/28 15:22
 * Desc 创建 Collection 集合，往集合中添加3个字符串，打印输出
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //接口的引用指向子类的实现
        Collection<String> words = new ArrayList<String>();
        //添加 3个字符串
        words.add("hello");
        words.add("world");
        words.add("hadoop");
        //打印集合对象
        System.out.println(words);
        System.out.println("=======================");
        words.remove("hello");
        System.out.println(words);

        /*System.out.println("=======================");
        words.clear();
        System.out.println(words);*/

        System.out.println("========================");
        boolean hadoop = words.contains("hadoop");
        System.out.println(hadoop);

        System.out.println("========================");
        boolean empty = words.isEmpty();
        System.out.println(empty);

        System.out.println("=========================");
        int size = words.size();
        System.out.println(size);
    }
}
