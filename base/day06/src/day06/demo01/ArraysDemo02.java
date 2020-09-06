package day06.demo01;

import java.util.Arrays;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 题目：将一个随机字符串中的所用字符升序排列，并倒序打印
 */
public class ArraysDemo02 {
    public static void test(){
        String str = "jfiw3u8w4u303u290fgh25f";
        char[] chars = str.toCharArray();//将字符串变为char类型数组
        Arrays.sort(chars);//将数组升序排列
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + "  ");//倒叙打印数组w  w  u  u  u  j  i  h  g  f  f  f  9  8  5  4  3  3  3  2  2  0  0
        }
    }
}
