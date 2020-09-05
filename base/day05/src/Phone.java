/**
 * Created by wangxiaowei on 2020/9/5.
 * 定义一个类，用来模拟手机
 * 属性：品牌，价格，颜色
 * 行为：打电话，发短信
 */
public class Phone {
    String brand;//品牌
    double price;//价格
    String color;//颜色

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
