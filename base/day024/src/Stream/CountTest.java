package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;
public class CountTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//8
    }
}
