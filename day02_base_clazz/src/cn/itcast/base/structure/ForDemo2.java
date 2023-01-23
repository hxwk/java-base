package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 10:30
 * Desc 求1-100之间的偶数和，并把求和结果打印到控制台上.
 */
public class ForDemo2 {
    public static void main(String[] args) {
        //定义变量 sum 用于接收 0 ~ 100之间的和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                // = 赋值
                //sum += i 等价于 sum = sum + i
                sum += i;
            }
        }
        //System.out.println("0~100之间的偶数之和为：" + sum);
        System.out.format("0~100之间的和 %s",sum);
        //print(f'0~100之间的和：{sum}')
    }
}
