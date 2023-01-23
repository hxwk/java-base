package cn.itcast.base.oop.inherit;

public class MotorBike extends Car{
    public static void main(String[] args) {

        /**
         * 1.实例化Car对象
         * 2.对当前的对象赋值，当前2个轮子，颜色是黑色,排量是0
         * 3.打印输出摩托自行车的属性
         */

        //1.实例化MotorBike对象
        MotorBike motorBike = new MotorBike();
        //2.对当前的对象赋值，当前2个轮子，颜色是黑色,排量是0
        motorBike.setWheels(2);
        motorBike.setColor("黑色");
        motorBike.setMotor(0);
        //3.打印输出摩托自行车的属性
        System.out.println("当前摩托车有 "+motorBike.getWheels()+" 个车轮，颜色是： "+motorBike.getColor()+" 排量为 "+motorBike.getMotor());
    }

}