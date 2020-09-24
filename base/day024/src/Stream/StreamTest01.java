package Stream;

import java.util.ArrayList;
public class StreamTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("赵敏");
        list.add("金毛狮王");
        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name-> System.out.print(name));//张无忌张三丰
    }
}
