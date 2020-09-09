package demo03;

import java.util.ArrayList;
import java.util.Collections;
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //public static <T> boolean addAll(Collection<T> c,T...elements):向集合中添加多个元素。
        Collections.addAll(arrayList,"a","b","c","d");
        System.out.println(arrayList);//[a, b, c, d]
        //public static void shuffie(List<?> list):打乱集合的顺序。
        Collections.shuffle(arrayList);
        System.out.println(arrayList);//[c, a, d, b]
    }
}
