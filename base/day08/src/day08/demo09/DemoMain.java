package day08.demo09;

import java.util.Date;
public class DemoMain {
    public static void main(String[] args) {
        //获取当前时间到时间原点的毫秒值
        System.out.println(System.currentTimeMillis());//1599568861960
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        //获取当前时间的到时间原点的毫秒值
        Date d = new Date();
        long l = d.getTime();
        System.out.println(l);//1599569711496
    }

    private static void demo02() {
        //通过毫秒值算出当前时间
        Date date = new Date(1599569484834L);
        System.out.println(date);
    }

    private static void demo01() {
        //获取当前日期
        Date d = new Date();
        System.out.println(d);//Tue Sep 08 20:51:24 CST 2020
    }
}
