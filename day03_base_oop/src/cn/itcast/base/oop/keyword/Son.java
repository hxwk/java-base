package cn.itcast.base.oop.keyword;

/**
 * Author itcast
 * Date 2022/2/26 14:47
 * Desc TODO
 */
public class Son extends Father {
    // final 定义说明是常量，只能被赋值一次。
    private final int age = 20;

    @Override
    public void show() {
        System.out.println("大家好！");
    }
}
