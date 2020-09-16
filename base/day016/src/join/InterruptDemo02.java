package join;

public class InterruptDemo02 {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination twoPhaseTermination = new TwoPhaseTermination();
        twoPhaseTermination.start();
        Thread.sleep(2000);
        twoPhaseTermination.stop();
    }
}
class TwoPhaseTermination{
    private Thread monitor;

    //启动监控线程
    public void start(){
        monitor= new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Thread thread = Thread.currentThread();
                    if (thread.isInterrupted() == true) {
                        System.out.println("料理后事");
                        break;
                    }
                    try {
                        Thread.sleep(50);
                        System.out.println("执行监控日志");
                    } catch (InterruptedException e) {
                        System.out.println("");
                        e.printStackTrace();
                        //重新设置打断标记
                        thread.interrupt();
                    }
                }
            }
        },"t1");
        monitor.start();
    }
    //关闭线程监控
    public void stop(){
        monitor.interrupt();
    }
}