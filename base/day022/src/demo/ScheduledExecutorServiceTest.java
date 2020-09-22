package demo;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        System.out.println("begin..." + new Date());
        pool.schedule(()->{
            System.out.println("task1....." + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },1, TimeUnit.SECONDS);
        pool.schedule(()->{
            System.out.println("task1....." + new Date());
        },1, TimeUnit.SECONDS);
    }
}
