package demo02;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain01 {
    public static void main(String[] args) {
        //以前Thread thread = new MyThread();
        //thread.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }.start();
    }
}
