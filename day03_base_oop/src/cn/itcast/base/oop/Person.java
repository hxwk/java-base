package cn.itcast.base.oop;

/**
 * Author itcast
 * Date 2022/2/26 10:27
 * Desc 定义Person类
 */
public class Person {
    //定义姓名和年龄 成员变量
    private String name;
    private int age;

    //无参构造
    public Person() {
        this.name = "北京人";
        this.age = 100;
    }

    //构造器 有参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //设置 getter setter 方法
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
