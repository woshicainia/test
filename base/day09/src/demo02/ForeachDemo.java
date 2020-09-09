package demo02;

import java.util.ArrayList;
import java.util.Collection;
public class ForeachDemo {
    public static void main(String[] args) {
        demo();
        demo01();
    }

    private static void demo01() {
        Collection<String> co = new ArrayList<String>();
        co.add("马云");
        co.add("王健林");
        co.add("马化腾");
        for (String s : co){
            System.out.print(s + "  ");//马云  王健林  马化腾
        }
    }

    private static void demo() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr){
            System.out.print(i + "  ");//1  2  3  4  5
        }
    }
}
