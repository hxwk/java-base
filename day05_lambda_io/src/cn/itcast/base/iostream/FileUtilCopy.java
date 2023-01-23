package cn.itcast.base.iostream;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Author itcast
 * Date 2022/3/1 17:06
 * Desc 需求-从文件 input.txt 中使用FileUtil工具读取文件并将其拷贝到另外一个文件 input_copy.txt 中
 */
public class FileUtilCopy {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(
                new File("G:\\out\\input.txt"),
                new File("G:\\out1\\input_copy.txt")
        );
    }
}
