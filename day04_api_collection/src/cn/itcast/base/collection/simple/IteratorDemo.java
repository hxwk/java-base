package cn.itcast.base.collection.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author itcast
 * Date 2022/2/28 15:40
 * Desc 遍历迭代出集合中的所有元素
 * 打印出来集合中 的每个值
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //接口的引用指向子类的实现
        Collection<String> words = new ArrayList<String>();
        //添加 3个字符串
        words.add("hello");
        words.add("world");
        words.add("hadoop");
        //获取集合的迭代器，遍历输出
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
