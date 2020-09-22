package demo;

import java.util.Timer;
import java.util.TimerTask;
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task1......");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task2....");
            }
        };
        // 使用 timer 添加两个任务，希望它们都在 1s 后执行
        // 但由于 timer 内只有一个线程来顺序执行队列中的任务，因此『任务1』的延时，影响了『任务2』的执行
        timer.schedule(task,1000);
        timer.schedule(task1,1000);
    }
}
