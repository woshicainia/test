package day08.demo03;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class Demo01Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();//内部类对象的创建
        inner.methodInner();
    }
}
