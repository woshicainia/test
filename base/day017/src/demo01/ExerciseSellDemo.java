package demo01;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
public class ExerciseSellDemo {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        //模拟多人卖票
        TicketWindow window = new TicketWindow(1000);
        // 所有线程的集合（由于threadList在主线程中，不被共享，因此使用ArrayList不会出现线程安全问题）
        List<Thread> threadList = new ArrayList<>();
        // 卖出的票数统计(Vector为线程安全类)
        List<Integer> amountList = new Vector<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int amount = window.sell(random.nextInt(5) + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    amountList.add(amount);
                }
            });
            threadList.add(thread);
            thread.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }
        //统计剩余票数和卖出去的票
        System.out.println("剩余票数：" + window.getCount());
        System.out.println("卖出去的票数：" + amountList.stream().mapToInt(i -> i).sum());
    }
}
//买票窗口
class TicketWindow{
    private int count;
    public TicketWindow(int count){
        this.count = count;
    }
    //获取票余数
    public int getCount(){
        return count;
    }
    //售票
    public synchronized int sell(int amount){
        if (count >= amount){
            this.count -= amount;
            return amount;
        }else {
            return 0;
        }
    }
}