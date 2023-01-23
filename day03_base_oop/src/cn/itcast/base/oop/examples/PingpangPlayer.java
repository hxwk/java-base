package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 17:00
 * Desc TODO
 */
public class PingpangPlayer extends Player implements Speak {

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃 ...");
    }

    @Override
    public void speakEnglish() {
        System.out.println("出国交流，流利口语");
    }

    @Override
    public void speakFranch() {
        System.out.println("学法语！");
    }

    @Override
    public String toString() {
        return super.getName()+" - "+super.getAge();
    }
}
