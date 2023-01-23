package cn.itcast.base.oop.inherit;

public class Phone {
    /**
     * 成员变量-属性
     */
    //属性 品牌(brand)
    private String brand;
    //属性 价格(price)
    private int price;
    //属性 颜色(color)
    private String color;

    //读取
    public String getBrand() {
        return this.brand;
    }

    //修改、写入
    public void setBrand(String _brand){
        this.brand = _brand;
    }

    /************************************************/

    //构造方法  类似于 python __init__ ，初始化类的属性，给属性赋值
    //构造方法要求：
    // 1.必须要和类名一模一样
    // 2.参数列表可以为空，0~多个
    // 3.不能返回类型，void 都不能有
    // this 代表是当前对象
    //构造方法默认情况下，会有一个无参构造方法，如果创建了一个有参构造，无参构造就必须指定。
    //构造方法就是做初始化的方法，给变量赋值
    public Phone(String _brand, int _price, String _color) {
        this.brand = _brand;
        this.price = _price;
        this.color = _color;
    }

    //需要手动指定无参构造方法
    public Phone() {
    }

    //成员方法，不能有 static
    protected void call(String name) {
        System.out.println("给 " + name + " 打电话");
    }

    //成员方法，发短信
    public void message(String name) {
        System.out.println("给 " + name + " 发短信");
    }


    @Override
    public String toString() {
        return brand + "|" + price + "|" + color;
    }
}