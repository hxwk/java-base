package cn.itcast.base.oop;

/**
 * Author itcast
 * Date 2022/2/26 10:32
 * Desc TODO
 */
public class PersonTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.teach();
        t1.setName("张三");
        t1.setAge(40);

        //创建 student
        Student s1 = new Student();
        s1.study();
        s1.setName("小明");
        s1.setAge(18);
    }
}
