package demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);//[1, 2, 3]

        for (Integer integer : set) {
            System.out.println(integer);//123
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);//123
        }
    }
}
