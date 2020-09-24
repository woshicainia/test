package Stream;

import java.util.stream.Stream;
public class FilterTest {
    public static void main(String[] args) {
        String[] strings = {"张无忌","张翠山","赵敏","周芷若"};
        Stream<String> stream = Stream.of(strings);
        //只要姓张的
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));
        stream1.forEach(name-> System.out.print(name));//张无忌张翠山
    }
}
