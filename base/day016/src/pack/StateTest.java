package pack;

/**
 * Created by wangxiaowei on 2020/9/16.
 */
public class StateTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                }
            }
        });
        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (StateTest.class){
                    try {
                        Thread.sleep(10000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t3.start();
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });
        t4.start();
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t5.start();
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (StateTest.class) {
                    try {
                        Thread.sleep(1000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t6.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());//NEW
        System.out.println(t2.getState());//RUNNABLE
        System.out.println(t3.getState());//TIMED_WAITING
        System.out.println(t4.getState());//TERMINATED
        System.out.println(t5.getState());//WAITING
        System.out.println(t6.getState());//BLOCKED
    }
}
