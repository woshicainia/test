package Stream;

import java.util.*;
import java.util.stream.Stream;
public class GetStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        Map<String,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();
        //将数组转换为Stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Integer[] integers = {1,2,3,4};
        Stream<Integer> integers1 = Stream.of(integers);
        String[] strings = {"a","bbb","ccc"};
        Stream<String> strings1 = Stream.of(strings);
    }
}
