package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 创建字符串的常见3+1种方式：

 三种构造方法：

 public String();创建一个空白字符串，不含有任何内容。

 public String(char[] array):根据字符数组的内容，来创建对应的字符串。

 public String(byte[] array):根据字节数组的内容，来创建对应的字符串。

 一种直接创建：

 String str = "Hello";//右边直接使用双引号。

 注意：直接写上双引号，就是字符串对象。
 */
public class StringDemo01 {
    public static void test() {
        String str1 = new String();
        System.out.println(str1);//这是一个空白的字符串
        char[] array = {'A','B','C'};
        String str2 = new String(array);//ABC
        System.out.println(str2);
        byte[] bytes = {97,98,99};
        System.out.println(new String(bytes));//abc
        String str3 = "abc";
        System.out.println(str3);//abc

    }
}
