package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public static double abs(double num):获取绝对值，有多种重载。
   public static double ceil(double num):向上取整。
   public static double floor(double num):向下取整。
   public static long round(double num):四舍五入。
 */
public class MathDemo01 {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(1));//1
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-1));//1
        //向上取整
        System.out.println(Math.ceil(2.3));//3.0
        System.out.println(Math.ceil(2.0));//2.0
        System.out.println(Math.ceil(2.6));//3.0
        //向下取整
        System.out.println(Math.floor(3.2));//3.0
        System.out.println(Math.floor(3.6));//3.0;
        System.out.println(Math.floor(3.9));//3.0
        //四舍五入
        System.out.println(Math.round(5.4));//5
        System.out.println(Math.round(5.5));//6
    }
}
