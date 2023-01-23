package cn.itcast.base.structure;

public class BreakDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Hello World! " + i);
        }
    }
}