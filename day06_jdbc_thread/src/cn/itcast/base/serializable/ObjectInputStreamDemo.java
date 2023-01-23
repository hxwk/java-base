package cn.itcast.base.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Author itcast
 * Date 2022/3/3 10:31
 * Desc 实现读取序列化之后的文件，将其转换成对象并打印输出
 * 需要使用到对象 ObjectInputStream 对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //获取 ObjectOutputStream 对象
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("G:\\out\\file\\student.txt")
        );
        //将对象读取出来
        Object object = objectInputStream.readObject();
        //将读取出来的对象转换成 Student 对象
        Student s1 = (Student) object;
        //打印输出这个对象
        System.out.println(s1.toString());
    }
}
