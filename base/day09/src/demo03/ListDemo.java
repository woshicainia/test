package demo03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//[a, b, c, d, a]

        //add(int index, Object e)   向集合指定索引处，添加指定的元素，原有元素依次后移
        list.add(2,"zhaosi");
        System.out.println(list);//[a, b, zhaosi, c, d, a]

        //E remove(int index)：将指定索引处的元素，从集合中删除，返回值为被删除的元素
        String s1 = list.remove(4);
        System.out.println(s1);//d
        System.out.println(list);//[a, b, zhaosi, c, a]

       //E set(int index, Object e)：将指定索引处的元素，替换成指定的元素，返回值为替换前的元素
        String s2 = list.set(3,"wangwu");
        System.out.println(s2);//c
        System.out.println(list);//[a, b, zhaosi, wangwu, a]

        //遍历集合的三种方法
        for (int i = 0; i < list.size(); i++) {
            //E get(int index)：获取指定索引处的元素，并返回该元素
            String s = list.get(i);
            System.out.print(s + "  ");//a  b  zhaosi  wangwu  a
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.print(s + "  ");//a  b  zhaosi  wangwu  a
        }

        for (String s : list) {
            System.out.print(s + "  ");//a  b  zhaosi  wangwu  a
        }

//        String s = list.get(10);//IndexOutOfBoundsException索引越界异常
    }
}
