/**
 * Created by wangxiaowei on 2020/8/30
 * 四则运算加减乘除.取模
 *      对于除法：除法用的整数，整数除以整数的结果任然是整数，只看商，不看余数。
 *      只有对于整数的取模运算才有意义。
 *      注意事项：一旦运算当中有不同类型的数据，那么结果将会是数据类型大的那种。
 */
public class SuanShuYunSuanFu {
    public static void main(String[] args) {
        //两个常量之间可以进行数学运算
        System.out.println(30 + 20);

        //两个变量也可以进行数学运算
        int i = 10;
        int j = 52;
        System.out.println(i + j);

        //变量和常量之间也可以进行运算
        System.out.println(i - 20);

        //整数相除任然是整数
        System.out.println(i/j);

        //取模
        System.out.println(i/j);

        //int + double = double
        System.out.println(i + 2.5);

    }
}
