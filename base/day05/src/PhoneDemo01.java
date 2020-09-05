/**
 * Created by wangxiaowei on 2020/9/5.
 * 根据phone类创建一个one对象
 */
public class PhoneDemo01 {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==============");

        one.brand = "苹果";
        one.price = 5241.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.sendMessage();
    }
}