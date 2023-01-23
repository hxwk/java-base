package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 16:55
 * Desc TODO
 */
public abstract class Player extends Person {

    public abstract void study();

    @Override
    public String toString() {
        System.out.println(super.getName()+" "+super.getAge());
        return super.getName()+" "+super.getAge();
    }
}
