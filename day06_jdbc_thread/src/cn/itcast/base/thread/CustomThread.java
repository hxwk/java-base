package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/3 17:04
 * Desc TODO
 */
public class CustomThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println(this.getName() + ": execute! "+i);
        }
    }
}
