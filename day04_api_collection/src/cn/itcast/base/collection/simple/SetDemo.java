package cn.itcast.base.collection.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * Author itcast
 * Date 2022/2/28 17:04
 * Desc 创建一个Set集合，查看是否Set集合中的元素是无序的。
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        HashSet<String> wordss = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        words.add("world");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
