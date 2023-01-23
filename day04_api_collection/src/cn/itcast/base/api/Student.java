package cn.itcast.base.api;

import java.util.Objects;

/**
 * Author itcast
 * Date 2022/2/28 10:11
 * Desc TODO
 */
public class Student {
    private String name;
    private int age;
    private String postGraduate;

    public Student(String name, int age, String postGraduate) {
        this.name = name;
        this.age = age;
        this.postGraduate = postGraduate;
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

    public String getPostGraduate() {
        return postGraduate;
    }

    public void setPostGraduate(String postGraduate) {
        this.postGraduate = postGraduate;
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+ " 年龄:"+this.age+ " 毕业院校："+this.postGraduate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(postGraduate, student.postGraduate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, postGraduate);
    }
}
