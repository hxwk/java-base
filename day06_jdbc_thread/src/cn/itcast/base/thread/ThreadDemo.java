package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/3 17:03
 * Desc 线程执行的，实现多线程，继承 Thread 类
 * 打印输出 0 ~ 300 执行线程的逻辑，并将哪个线程执行的 名称 也打印出来
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //执行了线程
        CustomThread th = new CustomThread();
        th.start();
        //在主线程中也打印输出 300 次
        for (int i = 0; i < 300; i++) {
            System.out.println("main主线打印输出！ "+i);
        }
    }
}
