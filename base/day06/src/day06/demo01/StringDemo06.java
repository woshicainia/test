package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值。
 public byte[] getBytes():获得当前字符串底层的字节数组。
 public String replace(CharSequence oldString,CharSequence newString):将所有出现的老字符串替换成为新的字符串，返回值替换之后的结果新字符串。
 备注：CharSepuence意思就是说可以接受字符串类型。
 */
public class StringDemo06 {
    public static void test(){
        String str = "hello";
        char[] chars = str.toCharArray();
        System.out.println(chars[1]);//e
        System.out.println(chars.length);//5

        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);//104 101 108 108 111
        }

        String str1 = "How do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str1);//How do you do
        System.out.println(str2);//H*w d* y*u d*
    }
}
