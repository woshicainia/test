package day07.demo01;

/**
 * Created by wangxiaowei on 2020/9/7.
 * 定义一个用户类
 */
public class User {
    private String name;//姓名
    private int money;//余额

    public User() {//无参构造
    }

    public User(String name, int money) {//全参构造
        this.name = name;
        this.money = money;
    }

    public void show(){//打印我是谁，我的余额有多少
        System.out.println("我是：" + name + ",余额有：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
