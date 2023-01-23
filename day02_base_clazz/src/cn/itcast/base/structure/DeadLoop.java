package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 11:05
 * Desc TODO
 */
public class DeadLoop {
    public static void main(String[] args) {
        //for循环用于固定次数的循环
        //while循环用于不固定次数的循环

        /*for(;;) {
            System.out.println("Hello World!");
        }*/
        while(true){
            System.out.println("Hello World");
        }
    }
}
