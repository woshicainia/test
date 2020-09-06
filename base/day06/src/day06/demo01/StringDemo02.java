package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 对于引用类型来说，==比较的是地址值。
 */
public class StringDemo02 {
    public static void  test() {
        String str1 = "abc";
        String str2 = "abc";
        char[] array = {'a','b','c'};
        String str3 = new String(array);

        System.out.println(str1 == str2);//true
        System.out.println(str3 == str2);//false
        System.out.println(str1 == str3);//false
    }
}
