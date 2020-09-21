package demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public class Test01 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2, new ThreadFactory() {
            private AtomicInteger integer = new AtomicInteger(1);
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"mypool_" + integer.getAndIncrement());

            }
        });


        threadPool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "执行了");
        });
        threadPool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "执行了");
        });
        threadPool.execute(()->{
            System.out.println(Thread.currentThread().getName() + "执行了");
        });
    }
}
