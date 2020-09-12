package demo02;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class RunnableImpl implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread .currentThread().getName() + "-->"  + i);
        }
    }
}
