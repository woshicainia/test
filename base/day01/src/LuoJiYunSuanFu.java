/**
 * Created by wangxiaowei on 2020/8/30.
 * 与  &  &&  算子两边全是真，结果才是真。
 * 或  |  ||   算子两边只要有一个是真的，结果就为真。
 * 非 ！ 取反的意思
 * ^  异或  算子两边不一样就为真
 * && || 节省性能
 */
public class LuoJiYunSuanFu {
    public static void main(String[] args) {
        System.out.println(true && false);//false

        System.out.println(true || false);//true

        System.out.println(!true);//false

        System.out.println(true ^ false);//true

        System.out.println(true & false);//false

        System.out.println(true | false);//true

        //短路与  只要是左边的表达式为假 后面的表达式就不执行了
        int i = 1;
        System.out.println(false && ++i <0);
        System.out.println(i);//后面的表达式没有运行，所以结果为1

        //短路或  只要左边的表达式为真，后面的表达式就不执行了
        System.out.println(true || --i >0);
        System.out.println(i);//结果还是1，因为后面的表达式没有执行。
    }
}
