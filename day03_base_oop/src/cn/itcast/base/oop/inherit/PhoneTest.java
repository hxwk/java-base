package cn.itcast.base.oop.inherit;

/**
 * Author itcast
 * Date 2022/2/26 10:55
 * 1.子类重写父类方法时, 方法声明上要用@Override注解来修饰.
 * 2.父类中私有的方法不能被重写.
 * 3.子类重写父类方法时, 访问权限不能更低. 只能使用 protected 或 public
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.call("zhangsan");

        /**
         * Phone p2 = new NewPhone();
         */
        //子类去调用 call
        //通过父类调用子类重写的 call 方法，只能调用父类中有的方法。
        //1.用的父类的方法  2.调用的是子类的实现
        //向上转换（隐式，自动）
        Phone p2 = new NewPhone();
        p2.call("zhangsan");
        p2.message("zhangsan");

        //直接调用子类的 call 方法
        //1.用的是子类的方法 2.调用的也是子类的方法
        NewPhone p3 = new NewPhone();
        p3.call("lisi");

        //向下转换，将父类强制类型转换成子类
        NewPhone p4 = (NewPhone)p2;
        p4.skype("王五");
    }
}
