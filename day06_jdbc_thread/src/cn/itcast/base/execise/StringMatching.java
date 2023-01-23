package cn.itcast.base.execise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author itcast
 * Date 2022/3/3 9:18
 * Desc TODO
 */
public class StringMatching {
    public static void main(String[] args) {
        String words = "woaiheima,buguanheimahaishibaima,zhaodaogongzuojiushihaoma";
        String word = "heima";

        getCount4(words, word);
        //根据匹配的索引位置来统计个数
    }

    /**
     * 通过获取子字符串中是否包含字符串判断出现的次数
     *
     * @param words
     * @param word
     */
    public static void getCount(String words, String word) {
        int count = 0;
        while (words.indexOf(word) >= 0) {
            words = words.substring(words.indexOf(word) + word.length());
            count++;
        }
        System.out.println(count);
    }

    /**
     * abcdefghcdfjlsdsjafkcdfjdlsajkf  获取 cd 出现的次数
     * abefghfjlsdsjafkfjdlsajkf
     *
     * @param words
     * @param word
     */
    public static void getCount2(String words, String word) {
        //源字符串的长度
        int srcLength = words.length();
        //替换掉 word 的长度
        int replaceLength = words.replace(word, "").length();
        //源长度-替换掉的长度 = 少了多少字符
        int count = (srcLength - replaceLength) / word.length();
        System.out.println(count);
    }

    public static void getCount3(String words, String word) {
        String[] arr = words.split(word);
        int count = 0;
        //当出现字符串在最后的位置
        if (words.lastIndexOf(word) + word.length() == words.length()) {
            count = arr.length;
        } else {
            count = arr.length - 1;
        }
        System.out.println(count);
    }

    /**
     * 使用正则表达式来获取匹配的字符串的个数
     * @param words
     * @param word
     */
    public static void getCount4(String words, String word){
        int count = 0;
        //使用正则表达式来匹配出现的次数
        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(words);
        while(m.find()){
            count ++;
        }
        System.out.println(count);
    }
}
