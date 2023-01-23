package cn.itcast.base.oop.innerclazz;

import com.sun.xml.internal.fastinfoset.algorithm.FloatEncodingAlgorithm;

/**
 * Author itcast
 * Date 2021/10/10 11:13
 * Desc TODO
 */
public class AnimalClass {
    //成员内部类 ，增强的属性
    public static class Feature{  //成员内部类
        //当前AnimalClass增强功能
        // 飞
        private String fly;
        // 观赏功能
        private String view;

        public void show(){
            System.out.println();
        }
    }

    public void method(){
         class Value{  //局部内部类
             private String price;
         }
    }

    public static void main(String[] args) {
        AnimalClass.Feature feature = new AnimalClass.Feature();
        String fly = feature.fly;
        feature.show();
    }

}