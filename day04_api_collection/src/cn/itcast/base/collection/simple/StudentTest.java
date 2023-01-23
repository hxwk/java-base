package cn.itcast.base.collection.simple;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Collection<Student> stu = new CopyOnWriteArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入" + i + 1 + "个学生的姓名：");
            String name = sc.next();
            System.out.println("请输入" + i + 1 + "个学生的年龄：");
            int age = sc.nextInt();
            stu.add(new Student(name, age));
        }
        // length = 3 , length = 4
        //原因：单向不可变性，ArrayList底层遍历的时候，Iterator来遍历的，
        //当Iterator指向的原始数据发生变化，Iterator自己迷失
        //如何解决这个问题？
        for (Student s : stu) {
            if (s.getName().equals("chh")) {
                stu.add(new Student("chh", 22));
            }
        }
        for (Student student : stu) {
            System.out.println(student);
        }
    }

    public static class Student {
        private String name;
        private int age;

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
            return "姓名:" + this.name + " 年龄:" + this.age;
        }
    }
}