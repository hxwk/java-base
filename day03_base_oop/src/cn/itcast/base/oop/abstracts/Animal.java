package cn.itcast.base.oop.abstracts;

/**
 * Author itcast
 * Date 2022/2/26 15:36
 * 当成员方法没有方法体，这个方法叫做抽象方法，需要被 abstract 修饰
 * 当一个类中有抽象方法时候，这个类就叫做抽象类，需要被 abstract 修饰
 */
public abstract class Animal {
    //抽象方法
    public abstract void eat();
    //实现的方法
    public void run(){
        System.out.println("动物会跑！");
    }
}
