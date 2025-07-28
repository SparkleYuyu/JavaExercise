package JavaBasics;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("Hello Map");

        //创建一个Map对象，使用HashMap来实现
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        //遍历-keySet()
        for(String key : map.keySet()) {
            System.out.println("Key: " + key + "; Value: " + map.get(key));
        }

        //遍历-Entry
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        //containsKey
        if(map.containsKey("Apple")) {
            System.out.println("The value of 'Apple' is " + map.get("Apple"));
        } else {
            System.out.println("No value correspond to 'Apple'");
        }
    }
}
