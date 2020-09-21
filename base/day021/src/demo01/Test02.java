package demo01;

import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"putting.....1");
            try {
                queue.put(1);
                System.out.println(Thread.currentThread().getName()+"putted......1");
                System.out.println(Thread.currentThread().getName()+"putting.....2");
                queue.put(2);
                System.out.println(Thread.currentThread().getName()+"putted......2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"t1").start();
        Thread.sleep(1000);
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+"take.....1");
                queue.take();
                System.out.println(Thread.currentThread().getName()+"taked......1");
                System.out.println(Thread.currentThread().getName()+"take......2");
                queue.take();
                System.out.println(Thread.currentThread().getName()+"taked......2");
            } catch (InterruptedException e) {

            }
        },"t2").start();
    }
}
