package demo02;

import java.util.HashMap;

/**
 * Created by wangxiaowei on 2020/9/15.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("张三","15");
        hashMap.put("李四","16");
        hashMap.put("王五","15");
        hashMap.put("张三","15");
        hashMap.put("李云龙","15");
        hashMap.put("马云","15");
        hashMap.put("马化腾","15");
        hashMap.put("王健林","15");
        hashMap.put("王思聪","15");
        hashMap.put("迪丽热巴","15");
        hashMap.put("古力娜拉","15");
        hashMap.put("马尔扎哈","15");
        hashMap.put("1","15");
        hashMap.put("2","15");
        hashMap.put("3","15");
        hashMap.put("4","15");
        hashMap.put("5","15");
        hashMap.put("6","15");
        hashMap.put("7","15");
        System.out.println(hashMap);
    }
}
