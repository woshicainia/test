package join;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class JoinDemo03 {
    static int r = 0;
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
                r = 10;
            }
        });
        t1.start();
        long l = System.currentTimeMillis();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1-l) + "毫秒" );//1020毫秒
    }
}
