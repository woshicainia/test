package join;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread.sleep(500);
        t1.interrupt();
        System.out.println("打断状态：" + t1.isInterrupted());//打断状态：false
    }
}
