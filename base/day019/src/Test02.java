import java.util.concurrent.locks.ReentrantLock;
public class Test02 {
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "尝试获得锁");
                lock.lockInterruptibly();//可打断的一种锁
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + "被打断");
                return;
            }
            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }, "t1");
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "获得锁");
            t1.start();
            Thread.sleep(2000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
