package cn.itcast.base.collection.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author itcast
 * Date 2022/2/28 15:44
 * 案例 - 自定义类并赋值存储到集合中，并打印输出
 * 定义一个学生类, 属性为姓名和年龄.
 * 创建Collection集合, 用来存储学生对象.
 * 往Collection集合中, 添加3个学生的信息.
 * 通过迭代器, 遍历集合.
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        //1.自定义一个学生类
        //2.创建 Collection 集合，存储学生对象
        Collection<Student> students = new ArrayList<>();
        //3.添加学生信息到集合中
        Student zhangsan = new Student("zhangsan", 25);
        students.add(zhangsan);
        Student lisi = new Student("lisi", 22);
        students.add(lisi);
        Student wangwu = new Student("wangwu", 23);
        students.add(wangwu);
        //4.遍历打印学生信息
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student stu = iterator.next();
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
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
