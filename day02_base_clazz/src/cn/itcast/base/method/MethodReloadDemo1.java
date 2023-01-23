package cn.itcast.base.method;

/**
 * Author itcast
 * Date 2022/2/25 16:42
 * Desc 方法的重载
 * 方法的重载就是方法名称必须一样，参数不一样的，就属于方法的重载
 * 参数不一样：
 * 1.参数的个数不一样   2   5   7
 * 2.参数的类型不一样   int , int    float , float
 * 需求： 计算两两值的和
 */
public class MethodReloadDemo1 {
    //成员变量，在类的内部，在方法外部
    private String method;

    public static void main(String[] args) {
        //局部变量
        float result = add(1.1F,1.2F);
        System.out.println(result);
    }

    /**
     * 成员方法
     * @param a
     * @param b
     * @return
     */
    public static float add(float a, float b) {
        return a + b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, int b, byte c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * @param arr 可变参数，参数不固定，可以1个，可以是2个，可以3个,
     *            int... 底层实现的就是个数组
     * @return
     */
    public static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
