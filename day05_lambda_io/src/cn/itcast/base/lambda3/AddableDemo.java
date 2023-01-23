package cn.itcast.base.lambda3;

/**
 * Author itcast
 * Date 2022/3/1 14:49
 * 定义一个测试类(AddableDemo)，在测试类中提供两个方法
 * 一个方法是：useAddable(Addable a)
 * 一个方法是主方法，在主方法中调用useAddable方法
 */
public class AddableDemo {
    public static void main(String[] args) {
        //1.使用匿名内部类实现累加求和
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return 2 * x + y;
            }
        });

        //2.使用lambda表达式来求和
        //int add(int x, int y);
        useAddable((x, y) -> 5 * x + y - 15);

    }

    public static void useAddable(Addable a) {
        int add = a.add(10, 20);
        System.out.println(add);
    }
}
