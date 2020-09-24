package Stream;

import java.util.Arrays;
import java.util.stream.Stream;
public class ConcatTest {
    public static void main(String[] args) {
        String[] str1 ={"张无忌"};
        String[] str2 ={"张三丰"};
        Stream<String> stream = Arrays.stream(str1);
        Stream<String> stream1 = Arrays.stream(str2);
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(name-> System.out.print(name));//张无忌张三丰
    }
}
