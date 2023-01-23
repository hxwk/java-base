package cn.itcast.base.thread;

/**
 * Author itcast
 * Date 2022/3/4 14:23
 * Desc 在main方法中创建一个线程，main执行完毕会关闭主main线程，
 * 开启的其他 线程会一直执行下去，知道结束
 */
public class ThreadDaemon {
    public static void main(String[] args) throws InterruptedException {
        //当前 JVM 虚拟机 main方法执行完毕
        Runtime.getRuntime().addShutdownHook(
                new Thread(()-> System.out.println("当前 JVM 虚拟机退出"))
        );

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while(true){
                            try {
                                System.out.println("当前程序正在运行....");
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        );

        //创建守护进程，后台进程，如果main方法中没有非守护进程执行了，守护进程跟着退出
        t1.setDaemon(true);
        t1.start();

        Thread.sleep(5000);
        System.out.println("当前 main 方法执行完毕");
    }
}
