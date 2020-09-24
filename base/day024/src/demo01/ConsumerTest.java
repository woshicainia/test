package demo01;

import java.util.function.Consumer;
public class ConsumerTest {
    public static void mothed(String str, Consumer<String> con){
        con.accept(str);
    }

    public static void main(String[] args) {
        String name = "赵丽颖";
        mothed(name,con->{
            System.out.println(name);//赵丽颖
            String rname = new StringBuffer(name).reverse().toString();//颖丽赵
            System.out.println(rname);
        });
    }
}
