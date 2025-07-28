package JavaBasics;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        System.out.println("Hello Set");

        //创建一个Set对象，使用HashSet来实现
        Set<Integer> set = new HashSet<>(); //HashSet:无重复元素、无序存储随机访问
        set.add(1);
        set.add(1);
        System.out.println(set.size());//1，无法添加重复元素
        set.add(10);
        set.add(100);
        set.add(1000);
        set.add(50000);
        for(int num : set){
            System.out.println(num);
        }
    }
}
