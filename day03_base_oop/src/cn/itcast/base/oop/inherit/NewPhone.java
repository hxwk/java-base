package cn.itcast.base.oop.inherit;

/**
 * Author itcast
 * Date 2022/2/26 10:53
 * Desc 子类中的 call 重写了 父类中的 call 方法
 *
 */
public class NewPhone extends Phone {

    @Override
    public void call(String name) {
        //父类的方法 call
//        super.call(name);
        System.out.println("我使用苹果手机给 "+name+" 打电话");
    }

    public void skype(String name){
        System.out.println("通过skype拨打视频电话");
    }

    public void call(String name,String abc){

    }

}
