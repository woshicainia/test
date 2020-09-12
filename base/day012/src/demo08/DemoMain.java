package demo08;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}
