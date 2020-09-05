package demo02;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 向ArrayLiat集合中添加包装类型数据
 */
public class ArrayListDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        int num= list.get(2);//自动拆箱
        System.out.println("集合中索引值是2的数是" + num);//集合中索引值是2的数是300
    }
}
