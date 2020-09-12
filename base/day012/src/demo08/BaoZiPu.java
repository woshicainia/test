package demo08;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class BaoZiPu extends Thread{
    private BaoZi baoZi;
    public BaoZiPu(BaoZi baoZi){
        this.baoZi = baoZi;
    }
    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (baoZi){
                if (baoZi.flag == true){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    if (count % 2 == 0){
                        baoZi.pi = "薄皮";
                        baoZi.xian = "三鲜馅";
                        System.out.println("正在生产：" + baoZi.pi + baoZi.xian + "的包子");
                        count++;
                    }else {
                        baoZi.pi = "冰皮";
                        baoZi.xian = "猪肉馅";
                        System.out.println("正在生产：" + baoZi.pi + baoZi.xian + "的包子");
                        count--;
                    }
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baoZi.notify();
                    System.out.println("吃货快来吃" + baoZi.pi + baoZi.xian + "的包子");
                    baoZi.flag = true;
                }
            }
        }
    }
}
