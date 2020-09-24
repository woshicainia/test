package demo01;

import java.util.function.Supplier;
public class Test02 {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String str = getString(()->"胡歌");
        System.out.println(str);//胡歌
    }
}
