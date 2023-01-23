package cn.itcast.base.lambda2;

/**
 * Author itcast
 * Date 2022/3/1 14:37
 * –定义一个接口(Flyable)，里面定义一个抽象方法：void fly(String s);
 * –定义一个测试类(FlyableDemo)，在测试类中提供两个方法
 * •一个方法是：useFlyable(Flyable f)
 * •一个方法是主方法，在主方法中调用useFlyable方法
 */
public interface Flyable {
    //抽象方法 fly
    void fly(String s);
}
