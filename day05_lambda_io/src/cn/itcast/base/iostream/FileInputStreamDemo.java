package cn.itcast.base.iostream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author itcast
 * Date 2022/3/1 16:44
 * 1.创建FileInputStream对象, 关联指定的数据源文件.
 * 2.通过一次读取一个字节的形式, 读取该文件中的数据.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        // 有构造器，可以直接 new
        try {
            FileInputStream fis = new FileInputStream("G:\\out\\file.txt");
            // a = 97
            /*int byte1 = fis.read();
            int byte2 = fis.read();
            int byte3 = fis.read();
            System.out.println((char)byte1 + " "+(char)byte2+" "+(char)byte3);*/
            /**
             * 一次读取一批的数据，一次读取出来10个字符
             */
            int len = 0;
            byte[] bytes = new byte[10];
            while ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
