package demo01;

import java.util.function.Predicate;
public class PredicateAndTest {
    public static boolean method(String str, Predicate<String> pre1,Predicate<String> pre2){
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        boolean reValue = method(str, (s) -> {
            //判断字符串的长度是否大于5
            return s.length() > 5;
        }, (s) -> {
            //判断字符串是否包含a
            return s.contains("a");
        });
        System.out.println(reValue);//true
    }
}
