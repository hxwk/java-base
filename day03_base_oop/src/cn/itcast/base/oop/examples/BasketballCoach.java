package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 17:03
 * Desc TODO
 */
public class BasketballCoach extends Coach  {
    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃....");
    }
}
