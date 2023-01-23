package cn.itcast.base.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author itcast
 * Date 2022/3/1 16:59
 * Desc 实现读取文件数据并将其拷贝到目标文件中
 */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //1.读取指定的文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("G:\\out\\file.txt");
            fos = new FileOutputStream("G:\\out\\file_copy.txt");

            int length = 0;
            byte[] bytes = new byte[1024];
            while((length=fis.read(bytes))!=-1){
                //2.拷贝到指定的文件
                fos.write(bytes,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //3.释放资源
        finally {
            fis.close();
            fos.close();
        }
    }
}
