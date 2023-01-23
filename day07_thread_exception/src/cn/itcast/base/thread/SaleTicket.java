package cn.itcast.base.thread;

import java.io.ObjectOutputStream;

/**
 * Author itcast
 * Date 2022/3/4 9:52
 * 实现卖票的功能，在此类中，主要实现一个卖票功能的线程功能
 * 开发步骤：
 * 1.实现一个 Runnable接口，重写 run 方法
 * 2.循环售卖 100 张电影票，直到卖完为止。
 */
public class SaleTicket implements Runnable {

    //初始化电影票数为 100
    private static int tickets = 100;
    //加锁，任意类型
    Integer st = new Integer(1);

    /**
     * 实现卖票的功能，卖掉 100 张电影票
     */
    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                //线程休眠时间设置为 200ms
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取一下当前线程的名字
                String currentName = Thread.currentThread().getName();
                /*synchronized (st) {
                    System.out.println(currentName + " 还剩票数：" + tickets--);
                }*/
                ticketDesc(currentName);
            } else {
                System.out.println("票已经卖完");
                break;
            }
        }
    }

    public static synchronized void ticketDesc(String currentName) {
        System.out.println(currentName + " 还剩票数：" + tickets--);
    }
}
