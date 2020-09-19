import java.util.concurrent.locks.ReentrantLock;
public class Test01 {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        System.out.println("尝试获得锁");
        lock.lock();
        try {
            System.out.println("获得锁");
            m1();
        } finally {
            lock.unlock();
        }
    }

    private static void m1() {
        lock.lock();
        try {
            System.out.println("m1执行");
            m2();
        } finally {
            lock.unlock();
        }
    }

    private static void m2() {
        lock.lock();
        try {
            System.out.println("m2执行");
        } finally {
            lock.unlock();
        }
    }
}
