package demo02;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 遍历ArrayList集合
 */
public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("迪丽热巴");
        list.add("古力娜拉");
        list.add("马尔扎哈");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            迪丽热巴
//            古力娜拉
//            马尔扎哈
        }
    }
}
