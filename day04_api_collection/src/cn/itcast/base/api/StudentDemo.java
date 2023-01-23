package cn.itcast.base.api;

/**
 * Author itcast
 * Date 2022/2/28 10:18
 * Desc TODO
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",25,"SWJTU");
        Student s2 = new Student("zhangsan",25,"SWJTU");
        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));
    }
}
