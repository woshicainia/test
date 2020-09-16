package demo;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class Demo02 {
    static int count = 0;
    static Object object = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    synchronized (object) {
                        count++;
                    }
                }
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    synchronized (object) {
                        count--;
                    }
                }
            }
        }, "t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count的值是：" + count);//count的值是：0
    }
}
