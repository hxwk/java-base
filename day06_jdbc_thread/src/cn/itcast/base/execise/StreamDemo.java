package cn.itcast.base.execise;

import java.util.ArrayList;
import java.util.List;

/**
 * Author itcast
 * Date 2022/3/3 11:41
 * Desc TODO
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("hello");
        lists.add("world");
        lists.add("spark");
        lists.add("flink");

        //lists.stream().forEach(System.out::println);

        String s = lists.stream().map(x -> x + " :" + x.length()).filter(x -> !x.equals("hello :5")).findFirst().get();
        System.out.println(s);
    }
}
