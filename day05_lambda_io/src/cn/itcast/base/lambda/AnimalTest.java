package cn.itcast.base.lambda;

/**
 * Author itcast
 * Date 2022/3/1 11:09
 * 1.已知接口Animal中有一个抽象方法eat()
 * 2.在测试类AnimalTest中定义show(Animal an)方法, 实现调用Animal#eat()方法.
 * 3.并在main方法中, 调用AnimalTest#show()方法.
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        //第一种方式，是匿名内部类
        //匿名内部类就是实现接口或者抽象方法，但是没有类名
        //test.show(new AnimalImpl());
        /*test.show(new Animal() {
            @Override
            public void eat() {
                System.out.println("羊吃草");
            }
        });*/

        //第二种方式，使用 lambda 表达式来实现
        //void eat();
        test.show(() -> {
            System.out.println("小猫吃鱼");
        });

    }

    public void show(Animal an){
        an.eat();
    }
}
