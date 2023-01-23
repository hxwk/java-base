package cn.itcast.base.serializable;

import java.io.Serializable;

/**
 * Author itcast
 * Date 2022/3/3 10:22
 * 学生对象，用于将此对象序列化成二进制字节码写入到磁盘或网络之间的传输；
 * 或 将二进制字节码转换成对象 反序列化使用。
 * 需要将此类实现 Serializable 接口从而才能实现序列化
 */
public class Student implements Serializable {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
