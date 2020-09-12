package demo09;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class RunnableImpl implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新的线程执行了");
    }
}
