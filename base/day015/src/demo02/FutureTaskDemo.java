package demo02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("running....");
                return 100;
            }
        });
        Thread thread = new Thread(task,"t1");
        thread.start();
        Integer integer = task.get();
        System.out.println(integer);
    }
}
