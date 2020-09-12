package demo02;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
