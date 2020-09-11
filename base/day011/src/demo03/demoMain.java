package demo03;


/**
 * Created by wangxiaowei on 2020/9/11.
 */
public class demoMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
