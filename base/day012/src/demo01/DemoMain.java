package demo01;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
