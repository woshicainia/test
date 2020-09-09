package demo01;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class Demo02 {
    public static void main(String[] args) {
        //自动装箱
        Integer integer = 1;
        //自动拆箱
        int i = integer;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //自动装箱
        arrayList.add(1);
        //自动拆箱
        int num = arrayList.get(0);
    }
}
