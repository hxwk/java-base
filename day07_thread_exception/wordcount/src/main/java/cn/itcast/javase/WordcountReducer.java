package cn.itcast.javase;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

/**
 * Author itcast
 * Date 2022/6/26 15:58
 * Desc TODO
 */
public class WordcountReducer extends Reducer<Text, IntWritable, Text,IntWritable> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        int sum = 0;
        Iterator<IntWritable> iterator = values.iterator();
        while(iterator.hasNext()){
            sum += iterator.next().get();
        }
        context.write(key,new IntWritable(sum));
    }
}
