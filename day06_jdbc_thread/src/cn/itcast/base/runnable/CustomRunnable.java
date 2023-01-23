package cn.itcast.base.runnable;

/**
 * Author itcast
 * Date 2022/3/3 17:08
 * Desc TODO
 */
public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + ": execute! " + i);
        }
    }
}
