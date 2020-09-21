package demo01;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test06 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        String str = pool.invokeAny(Arrays.asList(
                () -> {
                    System.out.println("begin...1");
                    Thread.sleep(1000);
                    System.out.println("end...1");
                    return "1";
                },
                () -> {
                    System.out.println("begin...2");
                    Thread.sleep(500);
                    System.out.println("end...2");
                    return "2";
                },
                () -> {
                    System.out.println("begin...3");
                    Thread.sleep(2000);
                    System.out.println("end...3");
                    return "3";
                }
        ));
        System.out.println(str);
    }
}
