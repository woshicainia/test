package demo07;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        final Object object = new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                //模拟顾客买包子
                synchronized (object){
                    System.out.println("顾客：老板我要买包子");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客：开始吃");
                }
            }
        }.start();
        //创建老板线程
        new Thread(){
            @Override
            public void run() {
                synchronized (object){
                    try {
                        System.out.println("老板：等我5秒");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("老板：包子做好了");
                    object.notify();
                }
            }
        }.start();
    }
}
