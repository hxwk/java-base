package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 10:58
 * Desc 计算0~100之间的偶数之和，并将结果打印输出
 * while 格式:
 * 初始化条件
 * while(判断条件){
 * 循环体;
 * 控制条件;
 * }
 */
public class WhileDemo {
    public static void main(String[] args) {
        //开发步骤：
        //1.定义获取求和的变量 sum
        int sum = 0;
        //2.初始化条件
        int i = 0;
        //3.while循环
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("0~100偶数之和：" + sum);
    }
}
