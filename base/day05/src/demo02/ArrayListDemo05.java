package demo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 题目：随机生成6个整数，添加到集合，并遍历集合。
 */
public class ArrayListDemo05 {
    public static void main(String[] args) {
        //创建一个整数包装类型的集合
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt());//自动装箱
        }
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            -1127373230
//            1738352197
//            -1499767020
//            -1080135584
//            -431097453
//            558587963
        }
    }
}
