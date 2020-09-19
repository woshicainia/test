package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    static final Object lock = new Object();
    static boolean hasCigarette = false;
    static boolean hasTakeout = false;
    static ReentrantLock room = new ReentrantLock();
    //创建等烟休息室
    static Condition waitHasCigarette = room.newCondition();
    //创建等外卖的休息室
    static Condition waitHasTakeout = room.newCondition();
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                room.lock();
                    try {
                        System.out.println(Thread.currentThread().getName()+"有烟吗" + hasCigarette);
                        while (!hasCigarette){
                            System.out.println(Thread.currentThread().getName()+"没烟先歇会");
                            try {
                                waitHasCigarette.await();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName()+"干活了");
                    } finally {
                        room.unlock();
                    }

            }
        },"小南").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                room.lock();
                try {
                    System.out.println(Thread.currentThread().getName()+"有外卖吗" + hasTakeout);
                    while (!hasTakeout){
                        System.out.println(Thread.currentThread().getName()+"没外卖先歇会");
                        try {
                            waitHasTakeout.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"干活了");
                } finally {
                    room.unlock();
                }

            }
        },"小女").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                room.lock();
                try {
                    hasTakeout= true;
                    System.out.println(Thread.currentThread().getName()+"有外卖了奥！");
                    waitHasTakeout.signal();
                } finally {
                    room.unlock();
                }
            }
        },"送外卖的").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                room.lock();
                try {
                    hasCigarette= true;
                    System.out.println(Thread.currentThread().getName()+"有烟了奥！");
                    waitHasCigarette.signal();
                } finally {
                    room.unlock();
                }
            }
        },"送烟的").start();
    }
}
