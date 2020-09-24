package demo01;

import java.util.function.Consumer;
public class TestAndThen {
    public static void method(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);//谁在前面谁先消费
    }

    public static void main(String[] args) {
        method("aaaAAA",(s)->{
            System.out.println(s.toUpperCase());//AAAAAA
        },(s)->{
            System.out.println(s.toLowerCase());//aaaaaa
        });
    }
}
