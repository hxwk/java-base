package cn.itcast.base.exception;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        boolean a = test();
        System.out.println(a);
    }

    public static boolean test() {
        try {
            System.out.println(1 / 0);
            //无效
            return true;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            return true;
        } finally {
            return false;
        }
    }
}