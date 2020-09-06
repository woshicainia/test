package day06.demo01;

import java.util.Scanner;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 题目：键盘输入一个字符串，并且统计其中各种字符出现的次数。种类有：大写字母、小写字母、数字、其他
 */
public class StringDemo09 {
    public static void test(String str){
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z'){
                countLower++;
            }else if ('A' <= chars[i] && chars[i] <= 'Z'){
                countUpper++;
            }else if ('0' <= chars[i] && chars[i] <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有" + countUpper);
        System.out.println("小写字母有" + countUpper);
        System.out.println("数字有" + countNumber);
        System.out.println("其他有" + countOther);
    }
}
