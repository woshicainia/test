/**
 * Created by wangxiaowei on 2020/9/5.
 * 使用对象作为方法的参数
 */
public class PhoneDemo02 {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "三星";
        one.price = 5652.0;
        one.color = "土豪金";
        method(one);//传递进去的实际上是地址值

    }
    public static void method(Phone one){
        System.out.println(one.brand);//三星
        System.out.println(one.price);//5652.0
        System.out.println(one.color);//土豪金
    }
}
