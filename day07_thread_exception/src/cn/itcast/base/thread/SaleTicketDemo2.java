package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/4 10:11
 * Desc TODO
 */
public class SaleTicketDemo2 {
    static int tickets = 100;
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
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
                        System.out.println(currentName + " 还剩票数：" + tickets--);
                    }
                }
            }).start();
        }
    }
}
