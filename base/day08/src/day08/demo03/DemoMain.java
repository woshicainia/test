package day08.demo03;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoMain {
    public static void main(String[] args) {
        //间接访问内部类成员方法，
        // 通过外部类的成员方法创建内部类的对象，在通过对象进行内部类方法的访问。
        Body body = new Body();
        body.bodyMethod();
        System.out.println("==============");
        //直接方法内部类成员方法
        Body.Hreat hreat = new Body().new Hreat();
        hreat.breat();
    }
}
