package cn.itcast.base.oop.duotai.animal;

/**
 * Author itcast
 * Date 2022/2/26 11:48
 * Desc TODO
 */
public class AnimalTest {
    public static void main(String[] args) {
        //向上转换 ， 自动转换
        //父类类型 变量 = new 子类类型();
        Animal animal = new Cat();
        animal.eat();
        //父类调用子类的特有方法
        //子类类型 变量 = (子类类型)父类的对象
        Cat cat = (Cat)animal;
        //子类变量就能调用子类的专有方法
        cat.run();
    }
}
