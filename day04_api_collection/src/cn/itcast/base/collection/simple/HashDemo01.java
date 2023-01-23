package cn.itcast.base.collection.simple;

public class HashDemo01 {
    public static void main(String[] args) {
        String a = "c";
        String b = "c";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println("============================");
        //相同的对象hash值一定相同，不同的对象hash值有可能相同；
        String zs = "zhangsan";
        String li = "lisi";
        System.out.println(zs.hashCode() == li.hashCode());
        System.out.println("============================");
        String zd = "重地";
        String th = "通话";
        System.out.println(zd.hashCode());
        System.out.println(th.hashCode());
        System.out.println(zd.hashCode() == th.hashCode());

        //hashcode % 3 = 1 : 就会分不到相同的分区中。
    }
}