package cn.itcast.base.oop.statics;

/**
 * Author itcast
 * Date 2022/2/26 14:56
 * Desc TODO
 */
public class Student {
    private String name;
    private int age;
    private static String graduateFrom="传智学院";

    public void show() {
        System.out.println(name + " " + age + " " + graduateFrom);
    }

    public static void study(){
        System.out.println("学习使我快乐！");
    }

    //为了能够在外部调用、读取、修改时，需要设置 getter 和 setter 方法
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

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(22);
        s1.show();

        //调用静态方法
        //类名.静态方法
        Student.study();
    }
}
