package demo03;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        //创建三个卖票窗口
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
