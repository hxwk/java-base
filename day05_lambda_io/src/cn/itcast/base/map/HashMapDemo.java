package cn.itcast.base.map;

import java.util.*;

/**
 * Author itcast
 * Date 2022/3/1 9:18
 * 1.定义Map集合, 键是学号, 值是学生的名字. (键值都是字符串类型).
 * 2.往Map集合中添加3对元素.
 * 3.打印Map集合对象.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //1.定义Map集合, 键是学号, 值是学生的名字. (键值都是字符串类型).
        Map<String,String> stuMap = new HashMap<>();
        //2.往Map集合中添加3对元素.
        stuMap.put("100001","张三");
        stuMap.put("100002","李四");
        stuMap.put("100003","王五");
        //3.打印Map集合对象.
        System.out.println(stuMap);
        //4 使用 entrySet 实体并打印输出每个 entry
        Iterator<Map.Entry<String, String>> iterator = stuMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println("key:"+key+" value:"+value);
        }
        System.out.println("=========remove==========");
        //remove 根据指定的key删除 entry
        String remove = stuMap.remove("100001");
        System.out.println(remove);

        System.out.println("==========containsKey========");
        boolean has = stuMap.containsKey("100002");
        System.out.println(has);

        System.out.println("========containsValue=========");
        boolean hasValue = stuMap.containsValue("王五");
        System.out.println(hasValue);

        System.out.println("========isEmpty=============");
        boolean isEmpty = stuMap.isEmpty();
        System.out.println(isEmpty);

        System.out.println("========size================");
        int size = stuMap.size();
        System.out.println(size);

        /*System.out.println("===========clear=========");
        stuMap.clear();
        System.out.println(stuMap);*/

        System.out.println("=========keySet()=========");
        Set<String> keys = stuMap.keySet();
        for (String key : keys) {
            System.out.println(key+" : "+ stuMap.get(key));
        }

        System.out.println("===========values===========");
        Collection<String> values = stuMap.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
