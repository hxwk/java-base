package cn.itcast.base.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //List 是 Collection 的子接口
        List<Integer> nums = new ArrayList<>();
        //输入五个数字
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        //按升序排序
        Collections.sort(nums);
        //打印输出
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println("=========reverse===========");
        //翻转元素的顺序
        Collections.reverse(nums);
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println("=========shuffle===========");
        //随机打散排列的列表
        Collections.shuffle(nums);
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}