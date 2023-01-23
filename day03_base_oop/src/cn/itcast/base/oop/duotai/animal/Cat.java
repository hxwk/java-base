package cn.itcast.base.oop.duotai.animal;

/**
 * Author itcast
 * Date 2022/2/26 11:47
 * Desc TODO
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void run(){
        System.out.println("猫会跳着跑");
    }

}
