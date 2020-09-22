package demo;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRateTest01 {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        System.out.println("bengin...." + new Date());
        pool.scheduleAtFixedRate(()->{
            System.out.println("task1..." + new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1,1, TimeUnit.SECONDS);
    }
}
