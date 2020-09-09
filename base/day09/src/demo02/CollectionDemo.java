package demo02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by wangxiaowei on 2020/9/9.
 * public boolean add(E e):把给定的对象添加到当前集合中。
 public void clear():清空集合中所有的元素。

 public boolean remove(E e):把当前对象在当前集合中删除。

 public boolean contains(E e):判断当前集合是否包含给定的对象。

 public boolean isEmpty():判断当前集合是否为空。

 public int size();返回集合元素的个数。

 public Object[] toArray():把集合中的元素，存储到数组中。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        System.out.println(collection);//[]

        // public boolean add(E e):把给定的对象添加到当前集合中。
        collection.add("张三");
        collection.add("赵四");
        collection.add("王五");
        collection.add("李六");
        collection.add("田七");
        System.out.println(collection);//[张三, 赵四, 王五, 李六, 田七]

        //public boolean remove(E e):把当前对象在当前集合中删除。
        collection.remove("赵四");
        System.out.println(collection);//[张三, 王五, 李六, 田七]

        //public boolean contains(E e):判断当前集合是否包含给定的对象。
        boolean b = collection.contains("田七");
        boolean b1 = collection.contains("赵四");
        System.out.println(b);//true
        System.out.println(b1);//false

        //public boolean isEmpty():判断当前集合是否为空。
        boolean b2 = collection.isEmpty();
        System.out.println(b2);//false

        //public int size();返回集合元素的个数。
        int size = collection.size();
        System.out.println(size);//4

        //public Object[] toArray():把集合中的元素，存储到数组中。
        Object[] objects = collection.toArray();
        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + "  ");//张三  王五  李六  田七
        }

        //public void clear():清空集合中所有的元素。
        //注意并不是删除集合，而是清空集合，变为一个空集合
        collection.clear();
        System.out.println(collection);//[]

        boolean b4 = collection.isEmpty();
        System.out.println(b4);//true
    }
}
