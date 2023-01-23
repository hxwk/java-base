package cn.itcast.base.oop.inherit;

public class Car {
    //属性：
    //有轮子，有颜色，有价格，有发动机
    private int wheels;
    //颜色
    private String color;
    //发动机
    private int motor;

    //默认情况下，有一个默认的无参的构造方法
    public Car(){
        //this(4,"蓝色",2);
    }
    //需要设置有参构造方法

    public Car(int wheels, String color, int motor) {
        this.wheels = wheels;
        this.color = color;
        this.motor = motor;
    }


    //对当前私有变量进行getter setter读写权限设

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    //方法（行为）：
    //载人，运货
    private void transport(int persons){
        System.out.println("当前车辆载人："+persons);
    }

    public  void load(){
        System.out.println("载货");
    }
}