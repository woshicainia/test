/**
 * Created by wangxiaowei on 2020/9/5.
 * 设置Person类中私有年龄
 */
public class PersonDemo01 {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        //创建一个人类的对象
        Person p = new Person();
        //设置人的年龄
        p.setAge(20);
        //给人的名字赋值
        p.name = "赵丽颖";
        //打印年龄和姓名
        System.out.println("我的名字是" + p.name + "     我的年龄是" + p.getAge());//我的名字是赵丽颖     我的年龄是20
    }
}
