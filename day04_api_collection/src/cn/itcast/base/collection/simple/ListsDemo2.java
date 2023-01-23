package cn.itcast.base.collection.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author itcast
 * Date 2022/2/28 16:41
 * Desc TODO
 */
public class ListsDemo2 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        Iterator<Integer> it = ints.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
