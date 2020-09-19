package demo;


public class Test05 {
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify(5,1);
        new Thread(()->{
            wn.print("a",1,2);
        }).start();
        new Thread(()->{
            wn.print("b",2,3);
        }).start();
        new Thread(()->{
            wn.print("c",3,1);
        }).start();
    }
}
class WaitNotify{
    public void print(String str,int falg,int nextFalg){
        for (int i = 0; i < loopNumber; i++) {
            synchronized (this){
                while (this.falg != falg){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(str);
                this.falg = nextFalg;
                this.notifyAll();
            }
        }
    }
    //循环次数
    private int loopNumber;
    //标记
    private int falg;

    public WaitNotify(int loopNumber, int falg) {
        this.loopNumber = loopNumber;
        this.falg = falg;
    }
}
