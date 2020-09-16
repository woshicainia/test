package pack;


import java.util.concurrent.locks.LockSupport;
public class PackDemo {
    public static void main(String[] args) throws InterruptedException {
        test();
    }
    public static void test() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("pack.....");
                LockSupport.park();
                System.out.println("unpack.....");
                System.out.println(Thread.interrupted());//会清除打断标记
                LockSupport.park();
                System.out.println("unpack.......");
            }
        },"t1");
        t1.start();
        Thread.sleep(500);
        t1.interrupt();
    }
}
