package demo03;

/**
 * Created by wangxiaowei on 2020/9/11.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run :" + i);
        }
    }
}
