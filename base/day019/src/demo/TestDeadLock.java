package demo;

import java.util.concurrent.locks.ReentrantLock;

public class TestDeadLock {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick("1");
        Chopstick c2 = new Chopstick("2");
        Chopstick c3 = new Chopstick("3");
        Chopstick c4 = new Chopstick("4");
        Chopstick c5 = new Chopstick("5");
        Philosopher t1 = new Philosopher("苏格拉底", c1, c2);
        Philosopher t2 = new Philosopher("柏拉图", c2, c3);
        Philosopher t3 = new Philosopher("亚里士多德", c3, c4);
        Philosopher t4 = new Philosopher("赫拉克利特", c4, c5);
        Philosopher t5 = new Philosopher("阿基米德", c5, c1);
        t1.setName("苏格拉底");
        t1.start();
        t2.setName("柏拉图");
        t2.start();
        t3.setName("亚里士多德");
        t3.start();
        t4.setName("赫拉克利特");
        t4.start();
        t5.setName("阿基米德");
        t5.start();
    }
}

class Philosopher extends Thread {
    Chopstick left;
    Chopstick right;

    public Philosopher(String name, Chopstick left, Chopstick right) {
        super(name);
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            //　尝试获得左手筷子
            if (left.tryLock()) {
                try {
                    // 尝试获得右手筷子
                    if (right.tryLock()){
                        try {
                            try {
                                eat();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } finally {
                            right.unlock();
                        }
                    }
                } finally {
                    left.unlock();
                }
            }
        }
    }

    private void eat() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"eating...");
        Thread.sleep(1000);
    }
}

class Chopstick extends ReentrantLock{
    String name;

    public Chopstick(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "筷子{" + name + '}';
    }
}

