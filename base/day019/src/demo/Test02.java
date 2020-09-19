package demo;


public class Test02 {
    static final Object lock = new Object();
    static boolean t2Runned = false;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    while (!t2Runned){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("1");
                }
            }
        },"t1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("2");
                    t2Runned = true;
                    lock.notify();
                }
            }
        },"t2").start();
    }
}
