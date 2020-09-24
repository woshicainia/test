package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("赵敏");
        list.add("金毛狮王");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::print);
    }
}
