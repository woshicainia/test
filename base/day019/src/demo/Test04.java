package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
public class Test04 {
    static ReentrantLock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static boolean t2Runned = false;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if (!t2Runned){
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("1");
                } finally {
                    lock.unlock();
                }
            }
        },"t1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("2");
                    t2Runned = true;
                    condition.signal();
                } finally {
                    lock.unlock();
                }
            }
        },"t2").start();
    }
}
