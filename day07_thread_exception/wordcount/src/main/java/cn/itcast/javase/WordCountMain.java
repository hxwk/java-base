package cn.itcast.javase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import java.io.IOException;

/**
 * Author itcast
 * Date 2022/6/26 16:00
 * Desc TODO
 */
public class WordCountMain {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        System.setProperty("HADOOP_USER_NAME","root");
        Configuration conf = new Configuration(true);
        Job job = Job.getInstance(conf,"wordcount");
        //
        job.setJarByClass(WordCountMain.class);
        job.setMapperClass(WordcountMapper.class);
        job.setInputFormatClass(TextInputFormat.class);
        TextInputFormat.addInputPath(job,new Path("hdfs://node1:8020/tmp/words.txt"));
        job.setMapperClass(WordcountMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);
        //
        job.setReducerClass(WordcountReducer.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        TextOutputFormat.setOutputPath(job,new Path("hdfs://node1:8020/tmp/out/"));
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        boolean flag = job.waitForCompletion(true);
        System.exit(flag?0:1);
    }
}
