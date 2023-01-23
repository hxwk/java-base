package cn.itcast.base.structure;

import java.util.Scanner;

/**
 * Author itcast
 * Date 2022/2/25 9:57
 * Desc 多重分支判断需求
 * –95~100 山地自行车一辆
 * –90~94 游乐场玩一次
 * –80~89 变形金刚玩具一个
 * –80以下 胖揍一顿
 */
public class StructureDemo2 {
    public static void main(String[] args) {
        //1.输入一个数字，考试成绩
        System.out.println("请输入您考试的成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //2.多重判断
        if(score>=95 && score <=100){
            System.out.println("山地自行车一辆");
        }else if(score >=90 && score<=94){
            System.out.println("游乐场玩一次");
        }else if(score >=80 && score <=89){
            System.out.println("变形金刚玩具一个");
        }else if(score >=0 &&score<80){
            //3.打印输出
            System.out.println("胖揍一顿");
        }else{
            System.out.println("输入的考试成绩不合法！");
        }
    }
}
