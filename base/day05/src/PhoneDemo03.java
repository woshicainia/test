/**
 * Created by wangxiaowei on 2020/9/5.
 * 使用对象类型作为方法的返回值类型
 */
public class PhoneDemo03 {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);//华为
        System.out.println(two.price);//3000.0
        System.out.println(two.color);//黑色
    }
    public static Phone getPhone(){
        Phone two = new Phone();
        two.brand = "华为";
        two.price = 3000.0;
        two.color = "黑色";
        return two;
    }
}
