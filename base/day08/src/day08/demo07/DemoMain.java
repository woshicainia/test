package day08.demo07;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
        hero.attack(new Skill() {//匿名对象加匿名内部类
            public void use() {
                System.out.println("da~da~da");
            }
        });
    }
}
