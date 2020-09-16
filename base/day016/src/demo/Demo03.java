package demo;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class Demo03 {
    public static void main(String[] args) {
        Room room = new Room();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    room.increment();
                }
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    room.decrement();
                }
            }
        }, "t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count的值是：" + room.getCount());//count的值是：0
    }
}
class Room{
    private int count = 0;
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public void decrement(){
        synchronized (this){
            count--;
        }
    }
    public int getCount(){
        synchronized (this){
            return count;
        }
    }
}