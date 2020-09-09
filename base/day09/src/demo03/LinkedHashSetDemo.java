package demo03;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo{
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("c");
        linkedHashSet.add("a");
        //有序不可重复
        System.out.println(linkedHashSet);//[a, b, c]
    }
}
