package demo02;

import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        //将字符串转换为字符数组
        char[] chars = s.toCharArray();
        //遍历字符数组
        for (char aChar : chars) {
            //判断hashMap集合中的key是否存在
            if (hashMap.containsKey(aChar)) {
                //如果存在value值加一并放到hashMap集合中
                Integer integer = hashMap.get(aChar);
                integer++;
                hashMap.put(aChar,integer);
            }else {
                //key不存在，就将key放在hashMap集合中，value值设置为1.
                hashMap.put(aChar,1);
            }
        }
        //遍历hashMap集合
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
