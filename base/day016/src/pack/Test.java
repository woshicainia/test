package pack;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始洗水壶");
                try {
                    Thread.sleep(1000);
                    System.out.println("开始烧水");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "老王");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始洗茶壶");
                try {
                    Thread.sleep(1000);
                    System.out.println("开始洗茶杯");
                    Thread.sleep(2000);
                    System.out.println("拿茶叶");
                    t1.join();
                    System.out.println("开始泡茶");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"小王");
        t1.start();
        t2.start();
    }
}
