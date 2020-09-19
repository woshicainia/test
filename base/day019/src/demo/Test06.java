package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        AwaitSignal awaitSignal = new AwaitSignal(5);
        Condition a = awaitSignal.newCondition();
        Condition b = awaitSignal.newCondition();
        Condition c = awaitSignal.newCondition();
        new Thread(()->{
            awaitSignal.print("a",a,b);
        }).start();
        new Thread(()->{
            awaitSignal.print("b",b,c);
        }).start();
        new Thread(()->{
            awaitSignal.print("c",c,a);
        }).start();
        Thread.sleep(1000);
        awaitSignal.lock();
        try {
            System.out.println("开始------------------");
            a.signal();
        } finally {
            awaitSignal.unlock();
        }
    }
}
class AwaitSignal extends ReentrantLock{
    public void print(String str,Condition condition,Condition next){
        for (int i = 0; i < loopNumber; i++) {
            lock();
            try {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(str);
                next.signal();
            }finally {
                unlock();
            }
        }
    }
    private int loopNumber;

    public AwaitSignal(int loopNumber) {
        this.loopNumber = loopNumber;
    }
}
