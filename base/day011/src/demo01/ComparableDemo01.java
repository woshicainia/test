package demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableDemo01 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",19));
        list.add(new Person("赵四",22));
        list.add(new Person("wangwu",15));
        System.out.println(list);//[Person{name='张三', age=19}, Person{name='赵四', age=22}, Person{name='wangwu', age=15}]
        Collections.sort(list);
        System.out.println(list);//[Person{name='wangwu', age=15}, Person{name='张三', age=19}, Person{name='赵四', age=22}]

    }
}
