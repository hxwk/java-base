package cn.itcast.base.collection.simple;

/**
 * Author itcast
 * Date 2022/2/28 17:25
 * Desc get方法，传入两个参数符号，可变参数，最终得到结果
 */
public class VariableParams {
    public static void main(String[] args) {
        int sum = get("+", 100, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);
    }

    public static int get(String symbol,int init, int... arr){
        if (symbol.equalsIgnoreCase("-")){
            for (int i = 0; i < arr.length; i++) {
                init -= arr[i];
            }
        }else if(symbol.equalsIgnoreCase("+")){
            for (int i = 0; i < arr.length; i++) {
                init += arr[i];
            }
        }else{
            System.out.println("没有这个符号的计算");
        }
        return init;
    }
}
