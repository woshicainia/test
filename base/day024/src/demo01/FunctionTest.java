package demo01;

import java.util.function.Function;
public class FunctionTest {
    public static void method(String str, Function<String,Integer> fun){
        Integer apply = fun.apply(str);
        System.out.println(apply);//1234
    }

    public static void main(String[] args) {
        String s = "1234";
        method(s,(string)->{
            return Integer.parseInt(string);//将字符串转换为Integer类型
        });
    }
}
