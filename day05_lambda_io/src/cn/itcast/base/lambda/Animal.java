package cn.itcast.base.lambda;

/**
 * 1.已知接口Animal中有一个抽象方法eat()
 * 2.在测试类AnimalTest中定义show(Animal an)方法, 实现调用Animal#eat()方法.
 * 3.并在main方法中, 调用AnimalTest#show()方法.
 */
public interface Animal {
    //定义了一个无参的抽象方法
    void eat();
}
