package cn.itcast.base.lambda3;

/**
 * –定义一个接口(Addable)，里面定义一个抽象方法：int add(int x,int y);
 * –定义一个测试类(AddableDemo)，在测试类中提供两个方法
 * •一个方法是：useAddable(Addable a)
 * •一个方法是主方法，在主方法中调用useAddable方法
 */
public interface Addable {
    /**
     * 声明一个方法，方法里面有两个参数
     * @param x
     * @param y
     * @return 这两个整数之和
     */
    int add(int x, int y);
}
