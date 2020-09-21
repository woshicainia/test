package demo01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Test05 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<String>> futures = pool.invokeAll(Arrays.asList(
                () -> {
                    System.out.println("begin...");
                    Thread.sleep(1000);
                    return "1";
                },
                () -> {
                    System.out.println("begin...");
                    Thread.sleep(500);
                    return "2";
                },
                () -> {
                    System.out.println("begin...");
                    Thread.sleep(2000);
                    return "3";
                }
        ));
        futures.forEach(f ->{
            try {
                System.out.println(f.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
