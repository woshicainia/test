package demo02;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 题目：打印输出{10@20@30}类似这样的字符串。
 */
public class ArrayListDemo07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张无忌");
        list.add("宋远桥");
        list.add("张三丰");
        list.add("张翠山");
        System.out.println(list);//[张无忌, 宋远桥, 张三丰, 张翠山]
        printArrayList(list);//{张无忌@宋远桥@张三丰@张翠山}
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size()-1){
                System.out.print("@");
            }else{
                System.out.print("}");
            }
        }
    }
}
