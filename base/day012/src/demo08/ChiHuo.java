package demo08;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class ChiHuo extends Thread{
    private BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("吃货开始吃：" + baoZi.pi + baoZi.xian + "的包子");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃货吃完了");
                    baoZi.flag = false;
                    baoZi.notify();
                    System.out.println("--------------------------");
                }
            }
        }
    }
}
