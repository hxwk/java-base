package cn.itcast.base.lambda2;

/**
 * Author itcast
 * Date 2022/3/1 14:38
 * 一个方法是：useFlyable(Flyable f)
 * 一个方法是主方法，在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //使用匿名内部类的方法创建
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "飞行");
            }
        });

        //使用 lambda 表达式来创建
        // void fly(String s);
        useFlyable(s -> System.out.println(s + "降落"));
    }

    public static void useFlyable(Flyable f) {
        f.fly("坐直升机");
    }

}
