package cn.itcast.base.oom;

/**
 * Author itcast
 * Date 2022/2/25 17:39
 * Desc TODO
 * Python 实例化对象调用是 __init__ 构造器
 * Java 实例化对象调用是构造方法 construct
 * 默认有一个无参构造方法，也可以定义有参构造方法
 */
public class PhoneTest {
    public static void main(String[] args) {
        //使用 Phone 类，需要先实例化，得到对象
        //Phone phone = new Phone("iphone",5000d,"银白色");
        //phone就是一个对象，实例化对象
        Phone phone = new Phone();
        //调用两个方法
        phone.call();
        phone.sendMessage();
        //获取字段
        String brand = phone.getBrand();
        phone.setColor("蓝色");

        Phone huaweiPhone = new Phone();
    }
}
