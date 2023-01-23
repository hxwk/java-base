package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 17:02
 * Desc TODO
 */
public class PingpangCoach extends Coach implements Speak,Ability {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃....");
    }

    @Override
    public void speakEnglish() {
        System.out.println("出国交流，学习英语");
    }

    @Override
    public void speakFranch() {
        System.out.println("学法语");
    }

    @Override
    public void useJava() {
        System.out.println("乒乓球教练会写Java");
    }

    @Override
    public String toString() {
        System.out.println(super.getName()+" "+super.getAge());
        return super.getName()+" "+super.getAge();
    }
}
