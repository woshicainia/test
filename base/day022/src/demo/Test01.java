package demo;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test01 {
    public static void main(String[] args) {
        DataContainer dataContainer = new DataContainer();
        new Thread(() -> {
            dataContainer.read();
        }, "t1").start();

        new Thread(() -> {
            dataContainer.read();
        }, "t2").start();
    }
}

class DataContainer {
    private Object data;
    private ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.ReadLock r = rw.readLock();
    private ReentrantReadWriteLock.WriteLock w = rw.writeLock();

    public Object read() {
        System.out.println("获取读锁...");
        r.lock();
        try {
            System.out.println("读取");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放读锁...");
            r.unlock();
        }
        return data;
    }

    public void write() {
        System.out.println("获取写锁...");
        w.lock();
        try {
            System.out.println("写入");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放写锁...");
            w.unlock();
        }
    }

}

