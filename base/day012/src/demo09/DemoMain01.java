package demo09;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了");
            }
        }).start();
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行了");
            }
        ).start();
    }
}
