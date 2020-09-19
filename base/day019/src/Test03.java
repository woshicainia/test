import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
public class Test03 {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "尝试获得锁");
            try {
                if (!lock.tryLock(2, TimeUnit.SECONDS)){
                    System.out.println(Thread.currentThread().getName() + "获得锁失败");
                    return;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
                System.out.println("被打断了");
                return;
            }
            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }, "t1");
        System.out.println(Thread.currentThread().getName() + "获得锁");
        lock.lock();
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        Thread.sleep(1000);
        try {
            System.out.println(Thread.currentThread().getName() + "释放锁");
        } finally {
            lock.unlock();
        }
    }
}
