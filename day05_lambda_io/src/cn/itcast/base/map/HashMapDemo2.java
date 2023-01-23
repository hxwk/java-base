package cn.itcast.base.map;

import java.util.HashMap;
import java.util.Objects;

/**
 * Author itcast
 * Date 2022/3/1 10:06
 * Desc 定义HashMap
 * key ： Student  value：String
 * 保证key的唯一性，相同的对象作为key，认为是相同的key
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Student,String> stus = new HashMap<>();
        stus.put(
                new Student("zhangsan",20),
                "100001"
        );

        stus.put(
                new Student("zhangsan",20),
                "100002"
        );

        for (Student student : stus.keySet()) {
            System.out.println(student.name+" "+student.age+" "+stus.get(student));
        }
    }

    public static class Student {
        private String name;
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

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
    }
}
