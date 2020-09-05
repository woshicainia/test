package demo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 题目：用一个大集合存放20个随机数字，然后筛选其中的偶数集合元素，放到小集合当中。要求使用自定义的方法来实现筛选。
 */
public class ArrayListDemo08 {
    public static void main(String[] args) {
        //接受新的集合
        ArrayList<Integer> list = choose();
        //遍历打印新的集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");//8  8  2  4  6  8  4  6  6  4  4
        }
    }
    public static ArrayList<Integer> choose (){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random r = new Random();
        //通过自动装箱向集合里装入20个整数
        for (int i = 0; i < 20; i++) {
            list1.add(r.nextInt(10) + 1);
        }
        //遍历集合，并且筛选出偶数装入新的集合
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0){
                list2.add(list1.get(i));
            }
        }
        //返回新的集合
        return list2;
    }
}
