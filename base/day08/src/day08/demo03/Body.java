package day08.demo03;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class Body {
    public class Hreat{
        public void breat(){
            System.out.println("心脏跳动：嘭嘭嘭");
            System.out.println("我的姓名是：" + name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bodyMethod(){
        System.out.println("外部类的成员方法");
        Hreat hreat = new Hreat();
        hreat.breat();
    }
}
