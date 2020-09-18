package MessageQueue;

import java.util.concurrent.locks.LockSupport;
public class TestParkUnpark {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start.....");
                System.out.println("park.....");
                LockSupport.park();
                System.out.println("repark.....");
            }
        });
        t1.start();
        Thread.sleep(1000);
        LockSupport.unpark(t1);
    }
}
