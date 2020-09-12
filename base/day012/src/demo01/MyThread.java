package demo01;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    }
}
