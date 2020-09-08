package day08.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> strings = addMehtod(list);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
    public static List<String> addMehtod(List<String > list){
        list.add("迪丽热巴");
        list.add("古力娜拉");
        list.add("马尔扎哈");
        return list;
    }
}
