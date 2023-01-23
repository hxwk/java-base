package cn.itcast.base.oop.abstracts;

/**
 * Author itcast
 * Date 2022/2/26 15:52
 * Desc TODO
 */
public class Cat extends Animal {
    //在红线上点击 Alt + Enter
    //会弹出来 implement methods 实现这个方法，因为是抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        a.run();
    }
}
