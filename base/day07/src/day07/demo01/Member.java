package day07.demo01;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by wangxiaowei on 2020/9/7.
 * 普通成员
 */
public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //随机生成集合的索引
        int index = new Random().nextInt(list.size());
        //将集合中索引位置元素删除，并将删除的元素赋值给收到红包的人
        int delta = list.remove(index);
        //设置收到红包的人的余额
        super.setMoney(super.getMoney() + delta);
    }
}
