package cn.itcast.javase;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Author itcast
 * Date 2022/6/26 15:56
 * Desc TODO
 */
public class WordcountMapper extends Mapper<LongWritable,Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        if(value!=null){
            String[] words = value.toString().split(",");
            for (String word : words) {
                context.write(new Text(word),new IntWritable(1));
            }
        }
    }
}
