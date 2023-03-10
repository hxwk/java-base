package cn.itcast.javase.hdfs;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Author itcast
 * Date 2022/6/27 6:42
 * Desc TODO
 */
public class FileSystemApi {
    /*public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://node1:8020/");
        conf.set("HADOOP_USER_NAME","root");
        FileSystem fileSystem = FileSystem.get(conf);
        System.out.println(fileSystem.toString());
    }*/


    public void listMyFiles() throws URISyntaxException, IOException, InterruptedException {
        FileSystem fileSystem = FileSystem
                .get(new URI("hdfs://node1:8020"), new Configuration(), "root");
        RemoteIterator<LocatedFileStatus> iter = fileSystem.listFiles(new Path("/"), true);
        //
        while (iter.hasNext()) {
            LocatedFileStatus next = iter.next();
            System.out.println(next.getPath().toString());
        }
    }

    @Test
    public void mkdirs() throws URISyntaxException, IOException, InterruptedException {
        FileSystem fileSystem = FileSystem
                .get(new URI("hdfs://node1:8020"), new Configuration(), "root");
        fileSystem.mkdirs(new Path("/tmp/abc"));
        fileSystem.close();
    }

    public void download() throws URISyntaxException, IOException, InterruptedException {
        FileSystem fileSystem = FileSystem
                .get(new URI("hdfs://node1:8020"), new Configuration(), "root");
        FSDataInputStream fis = fileSystem.open(new Path("/timer.txt"));

        FileOutputStream fos = new FileOutputStream("/output/timer.txt");
        IOUtils.copy(fis,fos);
    }

/*    public void upload() throws URISyntaxException, IOException, InterruptedException {
        FileSystem fileSystem = FileSystem
                .get(new URI("hdfs://node1:8020"), new Configuration(), "root");
        fileSystem.copyFromLocalFile("","");
    }*/
    @Test
    public void mergeFile() throws  Exception{
        //???????????????????????????
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.52.250:8020"), new Configuration(),"root");
        FSDataOutputStream outputStream = fileSystem.create(new Path("/bigfile.txt"));
        //????????????????????????
        LocalFileSystem local = FileSystem.getLocal(new Configuration());
        //????????????????????????????????????????????????????????????
        FileStatus[] fileStatuses = local.listStatus(new Path("file:///E:\\input"));
        for (FileStatus fileStatus : fileStatuses) {
            FSDataInputStream inputStream = local.open(fileStatus.getPath());
            IOUtils.copy(inputStream,outputStream);
            IOUtils.closeQuietly(inputStream);
        }
        IOUtils.closeQuietly(outputStream);
        local.close();
        fileSystem.close();
    }
}
