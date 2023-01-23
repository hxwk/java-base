package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/4 10:48
 * Desc TODO
 */
public class DeadLockDemo {

    //定义两把锁
    private static Object lockA = new Object();
    private static Object lockB = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (lockA){
                        System.out.println(Thread.currentThread().getName()+" 获取到锁A，等待锁B");
                        synchronized (lockB){
                            System.out.println("锁A 和 锁B 都获取到");
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (lockB){
                        System.out.println(Thread.currentThread().getName()+" 获取到锁B，等待锁A");
                        synchronized (lockA){
                            System.out.println("锁A 和 锁B 都获取到");
                        }
                    }
                }
            }
        }).start();
    }
}
