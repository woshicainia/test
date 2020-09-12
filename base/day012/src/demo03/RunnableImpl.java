package demo03;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class RunnableImpl implements Runnable{
    //有一百张票
    private int ticket = 100;
    public void run() {
        //模拟卖票
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "正在卖第：" + ticket +"票");
                ticket--;
            }
        }
    }
}
