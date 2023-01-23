package cn.itcast.base.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Author itcast
 * Date 2022/3/3 10:25
 * Desc 对象的输出案例
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        //将对象 Student 要以二进制的形式写入到磁盘
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("G:\\out\\file\\student.txt")
            );

            //定义一个 Student 对象
            Student s1 = new Student();
            s1.setName("张三丰");
            s1.setAge(50);

            oos.writeObject(s1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
