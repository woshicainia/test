package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;
public class LimitTest {
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
        Stream<Integer> stream1 = stream.limit(5);
        stream1.forEach(i-> System.out.print(i));//12345
    }
}
