package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 题目：定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。格式参照如下：[world#1world#2world#3]
 */
public class StringDemo08 {
    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                str += "world" + "#" + array[i] + "]";
            }else {
                str += "world" + "#" + array[i];
            }
        }
        return str;
    }
}
