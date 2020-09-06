package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度。
   public String concat(String str):将当前字符串和参数字符串拼接称为返回值新的字符串。
   public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）。
   public int indexof(String str):查找参数字符串当中首出现的索引位置，如果没有找到，返回-1值。
 */
public class StringDemo04 {
    public static void test() {
        int length = "jskfsgksgjhksjfkj".length();
        System.out.println("字符串的长度是：" + length);//17

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld

        char c = str1.charAt(1);
        System.out.println("第一号索引位置的字母是：" + c);//第一号索引位置的字母是：e

        int llo = str3.indexOf("llo");
        System.out.println("字符串llo在str3字符串首次出现的索引是：" + llo);//字符串llo在str3字符串首次出现的索引是：2
        int abc = str3.indexOf("abc");
        System.out.println("字符串abc在str3字符串首次出现的索引是：" + abc);//字符串llo在str3字符串首次出现的索引是：-1,说明没有找到。
    }
}
