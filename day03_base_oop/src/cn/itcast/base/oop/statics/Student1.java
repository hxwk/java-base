package cn.itcast.base.oop.statics;

/**
 * 总结：
 * 1.成员方法既可以访问静态变量 static，也可以访问成员变量（不带static|）
 * 2.静态方法中只能调用静态变量，不能调用成员变量
 * 3.成员方法既可以调用成员方法，也可以调用静态方法
 * 4.静态方法中只能调用静态方法，不能调用成员方法
 */
public class Student1 {
    //带 static 修饰的是不是成员变量？
    //不是成员变量
    static String name = null;
    static int age = 20;

    //成员方法可以调用静态变量和成员变量
    public void show1() {
        // 结论: 非静态方法可以访问所有成员(非静态变量和方法, 静态变量和方法)
        System.out.println(name);
        System.out.println(age);
        show2();
        show3();
    }

    public void show2() {
        int age = 30;
        //打印结果是什么呢? 如果要另外一个结果怎么办?
        System.out.println(this.age);
    }

    public static void show3() {
        // 结论: 静态方法只能访问静态成员.
        System.out.println(name);
        System.out.println(age);
        //不能调用成员方法
        //show2();
        show4();
    }

    public static void show4() {
        int age = 30;
        //打印结果是什么呢? 如果要另外一个结果怎么办?
        System.out.println(age);
    }
}