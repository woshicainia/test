package MessageQueue;

/**
 * Created by wangxiaowei on 2020/9/18.
 */
public class Test01 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        final Object obj1 = new Object();
        final Object obj2 = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj1) {
                    System.out.println("obj1...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj2) {
                        System.out.println("obj2....");
                    }
                }
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj2) {
                    System.out.println("obj2...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1) {
                        System.out.println("obj1....");
                    }
                }
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
