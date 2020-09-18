package waitnotify;


public class WaitNotifyDemo05 {
    static final Object lock = new Object();
    static boolean hasCigarette = false;
    static boolean hasTakeout = false;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+"有烟吗" + hasCigarette);
                    while (!hasCigarette){
                        System.out.println(Thread.currentThread().getName()+"没烟先歇会");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("有烟吗" + hasCigarette);
                    if (hasCigarette){
                        System.out.println(Thread.currentThread().getName()+"干活了");
                    }else {
                        System.out.println(Thread.currentThread().getName()+"没干成活");
                    }
                }
            }
        },"小南").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+"有外卖吗" + hasTakeout);
                    while (!hasTakeout){
                        System.out.println(Thread.currentThread().getName()+"没外卖先歇会");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"有外卖吗" + hasTakeout);
                    if (hasTakeout){
                        System.out.println(Thread.currentThread().getName()+"干活了");
                    }else {
                        System.out.println(Thread.currentThread().getName()+"没干成活");
                    }
                }
            }
        },"小女").start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
            synchronized (lock){
                hasTakeout= true;
                System.out.println(Thread.currentThread().getName()+"有外卖了奥！");
                lock.notifyAll();
            }
            }
        },"送外卖的").start();
    }
}
