package cn.itcast.base.collection.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author itcast
 * Date 2022/2/28 16:22
 * •定义一个学生类, 属性为姓名和年龄.
 * •创建List集合, 用来存储学生对象.
 * •往List集合中, 添加3个学生的信息.
 * •分别通过两种遍历方式, 来遍历List集合.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("zhangsan",25));
        students.add(new Student("lisi",23));
        students.add(new Student("wangwu",22));
        //遍历打印输出 list集合中的值
        //遍历1 - iterator 迭代输出
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println(stu);
        }
        System.out.println("================================");
        //遍历2 - 普通的 for 循环
        // size() : 代表 List集合的大小
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
        System.out.println("================================");
        //遍历3 - 增强 for 循环遍历打印输出每个值
        for(Student s : students){
            System.out.println(s);
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
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
