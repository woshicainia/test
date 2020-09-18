package waitnotify;

/**
 * Created by wangxiaowei on 2020/9/18.
 */
public class WaitNotifyDemo {
    static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("t1线程执行....");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1线程醒了");
                }
            }
        },"t1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("t2线程执行....");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2线程醒了");
                }
            }
        },"t2").start();
        Thread.sleep(2000);
        synchronized (lock){
//            lock.notify();//随机唤醒waitSet中的一个线程
            lock.notifyAll();//唤醒所有waitSet中的线程
        }
    }
}
