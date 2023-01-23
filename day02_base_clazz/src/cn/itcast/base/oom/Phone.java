package cn.itcast.base.oom;

/**
 * Author itcast
 * Date 2022/2/25 17:36
 * 1)定义手机类Phone.
 *  属性: 品牌(brand), 价格(price), 颜色(color)
 *  行为: 打电话(call), 发短信(sendMessage)
 * 2)创建测试类PhoneTest, 在类中定义main方法, 并访问手机类(Phone类)中的成员.
 * 类 < = > 成员变量 + 成员方法
 */
public class Phone {
    //使用 private 修饰成员变量，将这些成员变量隐藏起来
    private String brand;
    private double price;
    private String color;

    //构造方法的目的，就是实现成员变量的赋值。
    //无参构造方法
    //构造器的定义格式
    //1.构造方法名称必须 类名完全一致
    //2.构造方法没有返回值类型
    //3.构造方法没有返回值，可以写 return ,一般情况下不写。
    public Phone() {
    }

    // Alt + insert 有参构造方法
    //this 代表是当前对象的引用,谁调用就是谁
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // 提供方法获取成员 brand 的值
    //获取字段
    //getter setter 方法就是提供对成员变量的获取和修改的方法
    public String getBrand() {
        return brand;
    }

    //设置getter 和 setter 方法来设置字段的读写权限
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
