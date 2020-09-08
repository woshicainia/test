package day08.demo01;

/**
 * Created by wangxiaowei on 2020/9/8.
 * 定义一个猫类
 */
public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
