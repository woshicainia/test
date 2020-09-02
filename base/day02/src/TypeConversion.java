/**
 * Created by wangxiaowei on 2020/9/2.
 * 类型转换
 */
public class TypeConversion {
    public static void main(String[] args) {
        double d = 10/3;
        System.out.println(d);//3.0
        d = 10.0/3;
        System.out.println(d);//3.3333333333333335
        byte b = 3;//对，没有超出byte类型取值范围
        int i = 10;
        //byte num = i/3;//编译报错，编译器只检查语法，不会运算i/3;
    }
}
