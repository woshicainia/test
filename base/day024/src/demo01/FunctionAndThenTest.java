package demo01;

import java.util.function.Function;
public class FunctionAndThenTest {
    public static void method(String str, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String s = fun1.andThen(fun2).apply(str);
        System.out.println(s);//12340
    }

    public static void main(String[] args) {
        String strings = "1234";
        method(strings,(s)->{
             return Integer.parseInt(s) * 10;
        },(integer)->{
            return integer + "";
        });
    }
}
