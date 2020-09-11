package demo02;

import java.util.*;
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        System.out.println(map);//{杨过=小龙女, 郭靖=黄蓉, 张无忌=赵敏}
        //1、使用Map集合中的方法keySet(),把Map集合所有的key取出来，存储到一个Set集合中。
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            //2、遍历set集合，获取Map集合中的每一个key.
            String next = iterator.next();
            // 3、通过Map集合中的方法get （key），通过key找到value。
            String s = map.get(next);
            System.out.println(next + "=" + s);
            /*
            杨过=小龙女
            郭靖=黄蓉
            张无忌=赵敏
             */
        }
        System.out.println("------------------");
        for (String s : set) {
            String s1 = map.get(s);
            System.out.println(s + "=" + s1);
            /*
            杨过=小龙女
            郭靖=黄蓉
            张无忌=赵敏
             */
        }
    }
}
