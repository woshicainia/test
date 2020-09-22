package demo;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
public class RecursiveTaskTest {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(new AddTask(5)));
    }
}

class AddTask extends RecursiveTask<Integer> {
    int n;

    public AddTask(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "AddTask{" +
                "n=" + n +
                '}';
    }

    @Override
    protected Integer compute() {
        // 如果 n 已经为 1，可以求得结果了
        if (n == 1) {
            System.out.println("join" + n);
            return 1;
        }
        // 将任务进行拆分(fork)
        AddTask t1 = new AddTask(n - 1);
        t1.fork();
        System.out.println("fork" + n + t1);
        // 合并(join)结果
        int result = n + t1.join();
        System.out.println("join" + n + t1 + result);
        return result;
    }
}
