package cn.itcast.base.structure;

/**
 * Author itcast
 * Date 2022/2/25 9:30
 * Desc 选择结构分为三种：
 * 1.顺序结构
 * 从上向下，从左向右依次执行
 * 2.判断结构
 * 2.1 if语句
 * 2.1.1 单分支
 * if(条件){
 * 语句块1;
 * }
 * 2.1.2 双分支
 * if(条件){
 * 语句块1;
 * }else{
 * 语句块2;
 * }
 * 2.1.3 多分支
 * if(条件1){
 *     语句块1;
 * }else if(条件2){
 *     语句块2;
 * }else if(条件3){
 *     ...
 * }....
 * else{
 *     ...
 * }
 * 2.2 switch ... case ...语句
 * 3.循环结构
 */
public class StructureDemo {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("b");
        System.out.println(2 + " " + 3);

        //单分支
        int age = 20;
        if (age > 18) {
            System.out.println("已成年！");
        }

        //双分支
        if (age > 18 && age <= 200) {
            System.out.println("已成年");
        } else {
            System.out.println("未成年");
        }
    }
}
