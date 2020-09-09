package demo01;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //调用无参构造
        StringBuilder stringBuilder = new StringBuilder();
        //调用有参构造
        StringBuilder stringBuilder1 = new StringBuilder("ABC");
        System.out.println(stringBuilder);//空字符串
        System.out.println(stringBuilder1);//ABC
        //链式编程：方法返回值是一个对象，可以继续调用对象方法。
        stringBuilder.append("abc").append(true).append(8.8);
        System.out.println(stringBuilder);//abctrue8.8
    }
}
