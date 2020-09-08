package day08.demo04;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class OuterMain {
    public static void main(String[] args) {
        Outer outer = new Outer();//创建外部类对象
        outer.methodOuter();//访问外部类的成员方法
    }
}
