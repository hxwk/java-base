package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 11:10
 * Desc 双层for循环打印 9 * 9乘法表
 */
public class DoubleForDemo {
    public static void main(String[] args) {
        //外层for循环 9 行 控制行
        for (int i = 1; i <= 9; i++) {
            //列从1开始，第几行就有几列，内层for循环控制列
            for (int j = 1; j <= i; j++) {
                // 1*2=2 2*2=4
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            //每行输出回车换行
            System.out.println();
        }
    }
}
