package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public String substring(int index):截取从参数位置一直到字符串末尾。
 public String substring(int begin,int end)：截取从begin开始，一直到end结束，中间的字符串。
 备注：[begin,end),包含左边，不包含右边。
 */
public class StringDemo05 {
    public static void  test() {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);//World

        String str3 = str1.substring(4,7);
        System.out.println(str3);//owo
    }
}
