package cn.itcast.base.runnable;

/**
 * Author itcast
 * Date 2022/3/3 17:10
 * Desc TODO
 */
public class RunnableDemo {
    public static void main(String[] args) {
        CustomRunnable run = new CustomRunnable();
        //自定义 Thread
        Thread th = new Thread(run);
        th.start();
        //主方法打印 0 ~ 300
        for (int i = 0; i < 300; i++) {
            System.out.println("main主方法："+i);
        }
    }
}
