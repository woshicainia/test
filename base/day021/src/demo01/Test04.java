package demo01;

import java.util.concurrent.*;
public class Test04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<String> future = pool.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                System.out.println("running....");
                Thread.sleep(1000);
                return "ok";
            }
        });
        System.out.println(future.get());
    }
}
