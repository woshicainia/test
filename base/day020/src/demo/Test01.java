package demo;


public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination tpt = new TwoPhaseTermination();
        tpt.start();
        tpt.start();
        tpt.start();

        Thread.sleep(3500);
        System.out.println("停止监控");
        tpt.stop();
    }
}

class TwoPhaseTermination {
    // 监控线程
    private Thread monitorThread;
    // 停止标记
    private volatile boolean stop = false;  //设置成volatile 因为只有一个线程对stop进行操作
    // 判断是否执行过 start 方法
    private boolean starting = false;

    // 启动监控线程
    public void start() {
        synchronized (this) {    //需要加锁防止多个线程同时改变starting状态
            if (starting) { // false
                return;
            }
            starting = true;
        }
        monitorThread = new Thread(() -> {
            while (true) {
                Thread current = Thread.currentThread();
                // 是否被打断
                if (stop) {
                    System.out.println("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("执行监控记录");
                } catch (InterruptedException e) {
                }
            }
        }, "monitor");
        monitorThread.start();
    }

    // 停止监控线程
    public void stop() {
        stop = true;
        monitorThread.interrupt();
    }
}
