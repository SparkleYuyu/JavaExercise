package JavaBasics;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        System.out.println("List Example");

        //创建一个List对象，用ArrayList实现
        List<Integer> list = new ArrayList<>();

        //添加元素
        list.add(2);//2
        list.add(1);//2 1
        System.out.println(list.get(0));//2
        System.out.println(list.get(1));//1
        list.add(3);//2 1 3
        System.out.println(list.get(2));//3
        System.out.println("size: " + list.size());

        //删除元素
        list.remove(list.size() - 1);//2 1
        for(int element : list){
            System.out.println(element);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //清空list
        list.clear();
        System.out.println(list.isEmpty());

    }
}
