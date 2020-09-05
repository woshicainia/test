package demo01;

/**
 * Created by wangxiaowei on 2020/9/5.
 */
public class Person {
    String name;
    public void sayHello(String name){
        System.out.println(name + "你好，" + "我是" + this.name);//使用this关键字，访问本类中的成员变量。
    }
}
