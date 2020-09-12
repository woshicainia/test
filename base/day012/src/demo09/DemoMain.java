package demo09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangxiaowei on 2020/9/12.
 * Executors：线程池创建工厂类
 public static ExecutorService newFixedThreadPool(int nThreads)：返回线程池对象
 ExecutorService：线程池类
 Future<?> submit(Runnable task)：获取线程池中的某一个线程对象，并执行 Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用
 使用线程池中线程对象的步骤：
 1、创建线程池对象
 2、创建Runnable接口子类对象
 3、提交Runnable接口子类对象
 4、关闭线程池
 */
public class DemoMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.shutdown();
    }
}
