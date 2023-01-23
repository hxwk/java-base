package cn.itcast.base.lambda4;

import java.util.Comparator;
import java.util.function.*;

/**
 * Author itcast
 * Date 2022/3/1 15:22
 * Desc TODO
 */
public class LambdaMethod {
    public static void main(String[] args) {
        /**
         * public void print(int x){
         *  System.out.println(x);
         * }
         *
         */
        //Consumer 代表的是仅有一个参数输入，没有返回类型的操作
        Consumer<String> tConsumer = (x) -> System.out.println(x);
        //等价于
        Consumer<String> tConsumer2 = System.out::println;

        Function<String, Integer> str2Int = (String x) -> Integer.parseInt(x);
        System.out.println(str2Int.apply("234"));
        //等价于
        Function<String, Integer> str2Int2 = Integer::parseInt;
        System.out.println(str2Int2.apply("135"));

        //输入两个参数
        IntBinaryOperator compare1 = (int x, int y) -> Integer.compare(x, y);
        System.out.println(compare1.applyAsInt(2,2));
        //等价于
        Comparator<Integer> compare = Integer::compare;
        System.out.println(compare.compare(2,3));

        //自定义Student类,打印输出调用 name
        Student wangwu = new Student("王五", 28);
        Supplier<String> supplier = () -> wangwu.getName();
        System.out.println("wangwu name: "+supplier.get());
        //等价于
        Function<Student, String> getName = Student::getName;
        System.out.println("wangwu name:"+getName.apply(wangwu));
    }
}
