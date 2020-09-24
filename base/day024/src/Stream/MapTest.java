package Stream;

import java.util.stream.Stream;
public class MapTest {
    public static void main(String[] args) {
        String[] strings = {"1","2","3","4"};
        Stream<String> stream = Stream.of(strings);
        Stream<Integer> stream1 = stream.map(name->Integer.parseInt(name));
        stream1.forEach(i-> System.out.print(i));//1234
    }
}
