package demo01;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        String s = "hello";
        //将String类型转变成为StringBuilder类型
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("world");
        System.out.println(stringBuilder);//helloworld
        //将StringBuilder类型转换成为String类型。
        String s1 = stringBuilder.toString();
        System.out.println(s1);//helloworld
    }
}
