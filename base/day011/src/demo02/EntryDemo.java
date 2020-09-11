package demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class EntryDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        //1、使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中。
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //2、遍历Set集合，取出每一个Entry对象。
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            //3、使用Entry对象中的方法getKey()和getValue()获取键与值。
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "  " + value);
            /*
            杨过  小龙女
            郭靖  黄蓉
            张无忌  赵敏
             */
        }
        System.out.println("------------------------");
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  " + value);
            /*
            杨过  小龙女
            郭靖  黄蓉
            张无忌  赵敏
             */
        }
    }
}
