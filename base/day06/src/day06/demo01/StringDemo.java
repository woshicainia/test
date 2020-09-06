package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 姓名是：郭靖,年龄是：18，教室是：一号教室，学号是：2
 * 姓名是：黄蓉,年龄是：16，教室是：一号教室，学号是：1
 */
public class StringDemo {
    public static void test(){
        Student st2 = new Student("黄蓉",16);
        Student st1 = new Student("郭靖",18);
        st1.room = "一号教室";
        System.out.println("姓名是：" + st1.getName() + ",年龄是：" + st1.getAge() + "，教室是：" + st1.room + "，学号是：" + st1.getId());
        System.out.println("姓名是：" + st2.getName() + ",年龄是：" + st2.getAge() + "，教室是：" + st2.room + "，学号是：" + st2.getId());
    }
}
