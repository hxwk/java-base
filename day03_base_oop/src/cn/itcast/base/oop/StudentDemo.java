package cn.itcast.base.oop;

/**
 * Author itcast
 * Date 2022/2/26 10:06
 * Desc TODO
 */
public class StudentDemo {
    //成员变量
    private String name = "zhangsan";

    public void show(){
        //方法内的变量叫做 局部变量
        String name = "wangwu";
        //就近原则，读取局部变量的值
        System.out.println(name);
    }

    public static void main(String[] args) {
        // s1 是 Student类一个对象
        StudentDemo s1 = new StudentDemo();
        // s1 对象调用 show() 方法
        s1.show();
    }
}
