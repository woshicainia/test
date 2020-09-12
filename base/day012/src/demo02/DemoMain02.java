package demo02;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain02 {
    public static void main(String[] args) {
        //以前Thread t = new Thread(new RunnableImpl());
        //t.start();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }).start();
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();
    }
}
