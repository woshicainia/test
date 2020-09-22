package demo;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduleWithFixedDelayTest {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        System.out.println(new Date() + "bengin....");
        pool.scheduleWithFixedDelay(()->{
            System.out.println(new Date() + "task....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1,1, TimeUnit.SECONDS);
    }
}
