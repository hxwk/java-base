package cn.itcast.base.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author itcast
 * Date 2022/3/3 17:12
 * Desc 线程池的方式
 */
public class ExecutorsDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new CustomRunnable());
        for (int i = 0; i < 300; i++) {
            System.out.println("main线程 " +i);
        }
    }
}
