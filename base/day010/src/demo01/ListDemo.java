package demo01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * boolean add(E e)将指定的元素追加到此列表的末尾（可选操作）。
 void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
 boolean addAll(Collection<? extends E> c) 按指定集合的迭代器（可选操作）返回的顺序将指定集合中的所有元素附加到此列表的末尾。
 boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中的指定位置（可选操作）。
 void clear() 从此列表中删除所有元素（可选操作）。

 boolean contains(Object o) 如果此列表包含指定的元素，则返回 true 。
 boolean containsAll(Collection<?> c) 如果此列表包含指定 集合的所有元素，则返回true。
 boolean equals(Object o) 将指定的对象与此列表进行比较以获得相等性。
 E get(int index) 返回此列表中指定位置的元素。
 int hashCode() 返回此列表的哈希码值。

 int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
 boolean isEmpty() 如果此列表不包含元素，则返回 true 。
 Iterator<E> iterator() 以正确的顺序返回该列表中的元素的迭代器。
 int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
 ListIterator<E> listIterator() 返回列表中的列表迭代器（按适当的顺序）。

 ListIterator<E> listIterator(int index) 从列表中的指定位置开始，返回列表中的元素（按正确顺序）的列表迭代器。
 E remove(int index) 删除该列表中指定位置的元素（可选操作）。
 boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）（可选操作）。
 boolean removeAll(Collection<?> c) 从此列表中删除包含在指定集合中的所有元素（可选操作）。
 default void replaceAll(UnaryOperator<E> operator) 将该列表的每个元素替换为将该运算符应用于该元素的结果。
 boolean retainAll(Collection<?> c) 仅保留此列表中包含在指定集合中的元素（可选操作）。

 E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。
 int size() 返回此列表中的元素数。

 default void sort(Comparator<? super E> c) 使用随附的 Comparator排序此列表来比较元素。
 default Spliterator<E> spliterator() 在此列表中的元素上创建一个Spliterator 。
 List<E> subList(int fromIndex, int toIndex) 返回此列表中指定的 fromIndex （含）和 toIndex之间的视图。

 Object[] toArray() 以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组。
 <T> T[] toArray(T[] a) 以正确的顺序返回一个包含此列表中所有元素的数组（从第一个到最后一个元素）; 返回的数组的运行时类型是指定数组的运行时类型。
 */
public class ListDemo {
    public static void main(String[] args) {
        /*boolean add(E e)将指定的元素追加到此列表的末尾（可选操作）。
        void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
        boolean addAll(Collection<? extends E> c) 按指定集合的迭代器（可选操作）返回的顺序将指定集合中的所有元素附加到此列表的末尾。
        boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中的指定位置（可选操作）。
        void clear() 从此列表中删除所有元素（可选操作）。*/
        List<String> list = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        //boolean add(E e)将指定的元素追加到此列表的末尾（可选操作）。
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        System.out.println(list);//[张三, 李四, 王五]
        //void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
        list.add(1,"赵四");
        System.out.println(list);//[张三, 赵四, 李四, 王五]
        //boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中的指定位置（可选操作）。
        list.addAll(1,list1);
        System.out.println(list);//[张三, 张三, 李四, 王五, 赵四, 李四, 王五]
        list.addAll(list);
        //boolean addAll(Collection<? extends E> c) 按指定集合的迭代器（可选操作）返回的顺序将指定集合中的所有元素附加到此列表的末尾
        System.out.println(list);//[张三, 张三, 李四, 王五, 赵四, 李四, 王五, 张三, 张三, 李四, 王五, 赵四, 李四, 王五]
        //void clear() 从此列表中删除所有元素（可选操作）。
        list.clear();
        System.out.println(list);//[]

        /*boolean contains(Object o) 如果此列表包含指定的元素，则返回 true 。
         boolean containsAll(Collection<?> c) 如果此列表包含指定 集合的所有元素，则返回true。
         boolean equals(Object o) 将指定的对象与此列表进行比较以获得相等性。
         E get(int index) 返回此列表中指定位置的元素。
         int hashCode() 返回此列表的哈希码值。*/

        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        //boolean contains(Object o) 如果此列表包含指定的元素，则返回 true
        boolean b = list.contains("张三");
        System.out.println(b);//true
        //boolean containsAll(Collection<?> c) 如果此列表包含指定 集合的所有元素，则返回true。
        b = list.contains(list);
        System.out.println(b);//false
        //boolean equals(Object o) 将指定的对象与此列表进行比较以获得相等性。
        b = list.equals("张三");
        System.out.println(b);
        //E get(int index) 返回此列表中指定位置的元素。
        String s = list.get(1);
        System.out.println(s);
        //int hashCode() 返回此列表的哈希码值。
        int i = list.hashCode();
        System.out.println(i);//771739076
        /* int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
         boolean isEmpty() 如果此列表不包含元素，则返回 true 。
         Iterator<E> iterator() 以正确的顺序返回该列表中的元素的迭代器。
         int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
         ListIterator<E> listIterator() 返回列表中的列表迭代器（按适当的顺序）。*/
        //int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        i = list.indexOf("王五");
        System.out.println(i);//2
        //boolean isEmpty() 如果此列表不包含元素，则返回 true
        b = list.isEmpty();
        System.out.println(b);//false
        //int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        i = list.lastIndexOf("李四");
        System.out.println(i);//1
        /* ListIterator<E> listIterator(int index) 从列表中的指定位置开始，返回列表中的元素（按正确顺序）的列表迭代器。
         E remove(int index) 删除该列表中指定位置的元素（可选操作）。
         boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）（可选操作）。
         boolean removeAll(Collection<?> c) 从此列表中删除包含在指定集合中的所有元素（可选操作）。
         default void replaceAll(UnaryOperator<E> operator) 将该列表的每个元素替换为将该运算符应用于该元素的结果。
         boolean retainAll(Collection<?> c) 仅保留此列表中包含在指定集合中的元素（可选操作）。*/
        //E remove(int index) 删除该列表中指定位置的元素（可选操作）
        list.remove(1);
        System.out.println(list);//[张三, 王五]
        //boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）（可选操作）。
        b = list.remove("张三");
        System.out.println(b);//true
        /* E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素。
         int size() 返回此列表中的元素数。*/
        System.out.println(list);//[王五]
        String s1 = list.set(0,"迪丽热巴");
        System.out.println(s1);//王五
        System.out.println(list);//[迪丽热巴]
        /*Object[] toArray() 以正确的顺序（从第一个到最后一个元素）返回一个包含此列表中所有元素的数组。
         <T> T[] toArray(T[] a) 以正确的顺序返回一个包含此列表中所有元素的数组（从第一个到最后一个元素）; 返回的数组的运行时类型是指定数组的运行时类型。*/
        Object[] strings = list.toArray();
        for (Object string : strings) {
            System.out.println(string);//迪丽热巴
        };
    }
}
