package waitnotify;


public class WaitNotifyDemo01 {
    static final Object lock = new Object();
    static boolean hasCigarette = false;
    static boolean hasTakeout = false;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+"有烟吗" + hasCigarette);
                    if (!hasCigarette){
                        System.out.println(Thread.currentThread().getName()+"没烟先歇会");
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("有烟吗" + hasCigarette);
                    if (hasCigarette){
                        System.out.println(Thread.currentThread().getName()+"干活了");
                    }
                }
            }
        },"小南").start();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (lock){
                        System.out.println(Thread.currentThread().getName()+("开始干活"));
                    }
                }
            },"其他人").start();
        }
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
            hasCigarette = true;
            System.out.println(Thread.currentThread().getName()+"有烟了奥！");
            /*synchronized (lock){
                hasCigarette = true;
                System.out.println(Thread.currentThread().getName()+"有烟了奥！");
            }*/
            }
        },"送烟的").start();
    }
}
