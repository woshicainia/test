package Stream;

import java.util.stream.Stream;
public class ForEachTest {
    public static void main(String[] args) {
        String[] strings = {"张三","李四","王五"};
        Stream<String> stream = Stream.of(strings);
        stream.forEach(name-> System.out.print(name));//张三李四王五
    }
}
