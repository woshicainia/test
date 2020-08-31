/**
 * Created by wangxiaowei on 2020/8/30.
 * 复合运算符  可以理解为追加 追减
 * 重点结论:复合运算符不改变运算结果类型，假设最初的类型是byte类型，无论怎么追加或者追减，最终该变量的数据类型还是byte类型。
 */
public class FuZiYunSuanFu {
    public static void main(String[] args) {
        int i = 10;

        //i += 5;   i = i + 5;
        i += 5;
        System.out.println(i);

        i -= 5;
        System.out.println(i);

        i *= 5;
        System.out.println(i);

        i /= 5;
        System.out.println(i);

        i %= 5;
        System.out.println(i);

       byte j = 5;
        j += 5;
        System.out.println(j);
        //j = j + 5;的写法是错误的，计算机默认的计算结果是int类型。需要加强制类型转换符。
    }
}
