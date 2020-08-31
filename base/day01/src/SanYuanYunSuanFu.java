/**
 * Created by wangxiaowei on 2020/8/30.
 * 三元运算符
 * 需求：比较10，20的大小
 */
public class SanYuanYunSuanFu {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int max = i < j ? j : i;
        System.out.println("最大值" + max);

        //int a = 3 > 4 ? 2.5 : 10; 错误不兼容类型 必须满足两边都是int类型。
        System.out.println(3 < 4 ? 2.5 : 10);//这个可以，原因后面学。
    }
}
