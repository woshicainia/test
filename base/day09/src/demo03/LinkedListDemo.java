package demo03;

import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("a");

        //addFirst(E) 添加到链表的开头  等效于void push(E e):
        //addLast(E) 添加到链表的结尾
        linkedList.addFirst("www");
        linkedList.addLast("com");
        System.out.println(linkedList);//[www, a, b, c, d, a, com]

        //E removeFirst() 移除并返回链表的开头 等效于pop();
        //E removeLast() 移除并返回链表的结尾
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);//[a, b, c, d, a]

       // E getFirst() 获取链表的开头
        //E getLast() 获取链表的结尾
        String s1 = linkedList.getFirst();
        String s2 = linkedList.getLast();
        System.out.println(s1);//a
        System.out.println(s2);//a
    }
}
