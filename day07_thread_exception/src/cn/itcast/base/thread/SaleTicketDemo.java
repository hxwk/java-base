package cn.itcast.base.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Author itcast
 * Date 2022/3/4 10:00
 * Desc 实现3个线程来执行卖票的功能
 */
public class SaleTicketDemo {
    public static void main(String[] args) throws InterruptedException {

        //创建售票线程
        SaleTicket saleTicket = new SaleTicket();

        /*for (int i = 0; i < 3; i++) {
            Thread threadi = new Thread(saleTicket, "窗口" + (i + 1));
            threadi.setPriority(10);
            threadi.start();
        }*/
        Thread thread1 = new Thread(saleTicket,"窗口1");
        Thread thread2 = new Thread(saleTicket,"窗口2");
        Thread thread3 = new Thread(saleTicket,"窗口3");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();

        //
        Runtime.getRuntime().addShutdownHook(
                new Thread(()-> System.out.println(""))
        );

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("runnint....");
            }
        });

        thread.setDaemon(true);
        thread.start();

    }
}
