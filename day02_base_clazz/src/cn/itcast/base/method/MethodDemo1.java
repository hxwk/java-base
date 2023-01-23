package cn.itcast.base.method;

/**
 * Author itcast
 * Date 2022/2/25 16:28
 * Desc 需求 - 创建方法，用于打印数组中的每个值
 * 1.定义方法printArray(), 接收一个int类型的数组.
 * 2.通过该方法, 实现遍历数组的功能.
 * 3.在main方法中, 调用方法, 打印指定的数组.
 * <p>
 * 创建方法的格式：
 * 修饰符  返回类型  方法名称(参数类型 参数名1, 参数类型 参数名2 ...){
 * <p>
 * 代码块;
 * return 语句;
 * }
 * 注意事项：
 * 1.方法与方法之间不能嵌套，平级关系
 * 2.方法必须先创建后执行
 * 3.方法本身并不是自动运行，需要先手动调用再执行
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,2,4,6,8,10};
        //调用方法
        //nums 是一个实际参数，实参
        printArray(nums);
    }

    //public 就是公共的，任意的包，程序都能访问

    /**
     * 打印数组中的每个值
     * @param arr 数组的名称， arr 是一个形式参数
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
