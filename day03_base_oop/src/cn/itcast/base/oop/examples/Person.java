package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 16:54
 * Desc 抽象类，人类，下面有两个子类
 */
public abstract class Person {
    //成员变量 姓名和年龄
    private String name;
    private int age;
    //吃饭
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
