package demo01;

import java.util.function.Function;
public class Test06 {
    public static void method(String str, Function<String,String> fun1,Function<String,Integer> fun2){
        int sum = fun1.andThen(fun2).apply(str);
        System.out.println(sum);//40
    }

    public static void main(String[] args) {
        String string = "赵丽颖,20";
        method(string,(s)->{
            return s.split(",")[1];
        },(s)->{
            return Integer.parseInt(s) + 20;
        });
    }
}
