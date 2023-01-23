package cn.itcast.base.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author itcast
 * Date 2022/3/1 16:25
 * 1.创建FileOutputStream对象, 关联指定的目的地文件.
 * 2.往文件中写入字符'a', 'b', 'c'.
 * 注意:
 * 1.如果目的地文件不存在, 程序会自动创建.
 * 2.如果目的地文件的路径不存在, 程序会报错.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        // FileOutputStream 有构造器
        try {
            FileOutputStream fos = new FileOutputStream("G:\\out\\file.txt", true);
            //byte数组
            byte[] bytes = {'a', 'b', 'c'};
            fos.write(bytes);
            //
            byte[] bytes1 = "hello world".getBytes();
            fos.write(bytes1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
