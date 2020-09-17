package demo01;

import java.util.Random;
public class ExerciseTransfer {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Account a = new Account(1000);
        Account b = new Account(1000);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a.transfer(b, random.nextInt(5) + 1);
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                b.transfer(a, random.nextInt(5) + 1);
            }
        }, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // 查看转账2000次后的总金额
        System.out.println("total:"+ (a.getMoney() + b.getMoney()));//total:2000
    }
}
class Account{
    private int money;
    public Account(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void transfer(Account target, int amount) {
        synchronized(Account.class) {   //锁住Account类，因为涉及到A.money和B.money。
            if (this.money >= amount) {
                this.setMoney(this.getMoney() - amount);
                target.setMoney(target.getMoney() + amount);
            }
        }
    }
}