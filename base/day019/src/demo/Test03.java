package demo;

import java.util.concurrent.locks.LockSupport;
public class Test03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockSupport.park();
                System.out.println("1");
            }
        }, "t1");
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2");
                LockSupport.unpark(t1);
            }
        }).start();
    }
}
