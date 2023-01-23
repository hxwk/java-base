package cn.itcast.base.iostream;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Author itcast
 * Date 2022/3/1 16:36
 * Desc TODO
 */
public class FileUtilOutputDemo {
    public static void main(String[] args) {
        //使用FileUtils.write() ，底层实现的就 FileOutputStream ，
        //为了简化起见，直接使用 FileUtils 工具类来实现文件内容的读写
        try {
            FileUtils.write(
                    new File("G:\\out\\file1.txt"),
                    "abc",
                    true
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
