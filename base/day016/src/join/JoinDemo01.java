package join;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class JoinDemo01 {
    static int r = 0;
    static int r1 = 0;
    static int r2 = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("wake up....");
                    e.printStackTrace();
                }
                r1 = 10;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                r2 = 20;
            }
        });
        t1.start();
        t2.start();
        long l = System.currentTimeMillis();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l1 = System.currentTimeMillis();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println((l1-l)+ "毫秒");
    }
}
