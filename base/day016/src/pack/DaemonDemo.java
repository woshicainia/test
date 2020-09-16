package pack;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted() == true) {
                        break;
                    }
                }
            }
        },"t1");
        t1.setDaemon(true);//设置为守护线程
        t1.start();
        Thread.sleep(1000);
        System.out.println("运行结束....");
    }
}
