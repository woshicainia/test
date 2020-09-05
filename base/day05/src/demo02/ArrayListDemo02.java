package demo02;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/5.
 * public boolean add(E e):向集合中添加元素，参数的类型和泛型一样。返回值代表添加是否成功。

 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。但是对于其他集合（今后学习）来说，add添加动作不一定成功。

 public E get(int index):从集合当中获取元素，参数就是索引编号，返回值就是对应位置的元素。

 public E remove(int index):从集合中删除元素，参数是索引编号，返回值就是被删除的元素。

 public int size():获取集合尺寸长度，返回值是集合中包含的元素个数。
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("迪丽热巴");
        list.add("古力娜拉");
        list.add("马尔扎哈");
        System.out.println(list.get(1));//迪丽热巴
        list.add("李小璐");
        list.add("贾乃亮");
        list.add("高圆圆");
        String name = list.remove(3);
        System.out.println("被删除的名字是：" + name);//被删除的名字是：李小璐
        System.out.println("集合的长度是:" + list.size());//集合的长度是:5
    }
}
