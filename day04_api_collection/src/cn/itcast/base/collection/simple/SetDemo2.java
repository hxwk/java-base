package cn.itcast.base.collection.simple;

import java.util.*;
/**
 * Author itcast
 * Date 2022/2/28 17:11
 * Desc TODO
 */
public class SetDemo2 {
    public static void main(String[] args) {
        //2.创建 Set 集合，存储学生对象
        Set<Student> students = new HashSet<>();
        //3.添加学生信息到集合中
        Student zhangsan = new Student("zhangsan", 25);
        students.add(zhangsan);
        Student lisi = new Student("zhangsan", 25);
        students.add(lisi);

        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    public static class Student{
        //成员变量
        private String name;
        private int age;
        //成员方法
        //构造器 有参构造和无参构造
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //getter setter方法
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

        //toString equal hashcode等方法
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
