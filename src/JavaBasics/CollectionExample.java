package JavaBasics;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //创建一个collection对象，使用ArrayList作为实现类
        Collection<String> collection = new ArrayList<>();

        //添加元素
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        //输出集合大小
        System.out.println("集合大小： " + collection.size());

        //判断集合是否含有某个元素
        System.out.println("集合是否包含‘cherry’： " + collection.contains("Cherry"));

        //使用迭代器遍历集合
        Iterator<String> iterator =  collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //使用for-loop遍历集合
        for(String string : collection) {
            System.out.println(string);
        }

        //移除元素
        collection.remove("Apple");
        System.out.println("移除Apple后集合大小： " + collection.size());

        //情况集合
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

    }
}
