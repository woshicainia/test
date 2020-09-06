package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 字符串内容的比较
 * equals方法：比较两个字符串内容是否相等
 * equalsIgnoreCase方法：忽略字母大小写，进行字符串内容的比较。
 */
public class StringDemo03 {
    public static void  test() {
        String name = "zhangsan";
        String name1 = "zhangsan";
        char[] array = {'z','h','a','n','g','s','a','n'};
        String str3 = new String(array);
        System.out.println(name.equals(name1));//true
        System.out.println(name.equals(str3));//true
        System.out.println("lisi".equals(str3));//false
        System.out.println("ZHANGSAN".equalsIgnoreCase(name));//true
    }
}
