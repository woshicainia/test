package day08.demo06;

import day08.demo03.Body;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoMain {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("多兰剑");
        Hero hero = new Hero("盖伦",20,weapon);
        hero.attack();//名字为：盖伦,年龄为：20,用多兰剑攻击别人
    }
}
