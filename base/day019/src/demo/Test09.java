package demo;

public class Test09 {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination twoPhaseTermination = new TwoPhaseTermination();
        twoPhaseTermination.start();
        Thread.sleep(2000);
        twoPhaseTermination.stop();
    }
}
class TwoPhaseTermination{
    private volatile boolean stop = false;
    private Thread monitor;

    //启动监控线程
    public void start(){
        monitor= new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (stop) {
                        System.out.println("料理后事");
                        break;
                    }
                    try {
                        Thread.sleep(50);
                        System.out.println("执行监控日志");
                    } catch (InterruptedException e) {
                    }
                }
            }
        },"t1");
        monitor.start();
    }
    //关闭线程监控
    public void stop(){
        stop = true;
        monitor.interrupt();
    }
}