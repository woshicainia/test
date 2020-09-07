package day07.demo01;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/7.
 * 群主类
 */
public class Manager extends User {
    public Manager() {//无参构造
    }

    public Manager(String name, int money) {//全参构造
        super(name, money);
    }

    //这个方法的作用将群主发红包的总金额分成count份，分别装进ArrayList集合中
    public ArrayList<Integer> send(int totalMoney,int count){
        //定义一个空的集合
        ArrayList<Integer> redList = new ArrayList<Integer>();
        //群主现在的余额是多少
        int leftMoney = super.getMoney();
        //判断群主要发的红包数值是否超过自己的余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            //返回一个空集合
            return redList;
        }
        //保存群主发出红包后剩多少钱
        super.setMoney(leftMoney-totalMoney);
        //将钱分成count份
        int avg = totalMoney / count;
        //分成份的钱剩下的零头
        int mod = totalMoney % count;
        //将分号的钱装进ArrayList集合
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //将零头加上平均值放进集合最后一个
        int last = avg + mod;
        redList.add(last);
        //放回集合
        return redList;
    }
}
