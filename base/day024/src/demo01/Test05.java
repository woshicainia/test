package demo01;

import java.util.ArrayList;
import java.util.function.Predicate;
public class Test05 {
    public static ArrayList<String> method(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        //过滤字符串数组，将结果储存到集合中
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean test = pre1.and(pre2).test(s);
            if (test){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
        ArrayList<String> list = method(arr, (s) -> {
            //逗号后后面的性别为女为真
            return s.split(",")[1].equals("女");
        }, (s) -> {
            //姓名的长度大于3为真
            return s.split(",")[0].length() > 3;
        });
        System.out.println(list);//[迪丽热巴,女, 古力娜扎,女]
    }
}
