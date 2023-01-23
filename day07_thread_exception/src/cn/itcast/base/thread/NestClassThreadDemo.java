package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/4 9:19
 * Desc 通过匿名内部类的方法来实现打印输出 20 个 张宇
 * 主线程中也打印 20 个费玉清
 * new Thread(
 * new Runnable(){
 *
 * @Override public void run(){
 * 实现具体的多线程业务
 * }
 * }
 * ).start();
 */
public class NestClassThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " 张宇");
                }
            }
        }).start();
        //打印输出 20个费玉清
        for (int i = 0; i < 20; i++) {
            System.out.println("main线程，费玉清");
        }
        //使用 lambda 表达式来实现打印 JayChou
        //public abstract void run();
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " JayChou");
            }
        }).start();
    }
}
