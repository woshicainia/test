package demo01;

import java.util.function.Predicate;
public class PredicateTest {
    public static boolean method(String str, Predicate<String> pre){
        return pre.test(str);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        boolean reValue = method(str, (s) -> {
            return s.length() > 5;
        });
        System.out.println(reValue);//true
    }
}
