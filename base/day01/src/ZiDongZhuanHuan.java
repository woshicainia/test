/**
 * Created by wangxiaowei on 2020/8/30.
 * 自动类型转换：
 *      1.特点：代码不需要进行特殊处理，自动完成；
 *      2.规则：数据范围从小到大
 */
public class ZiDongZhuanHuan {
    public static void main(String[] args) {
        long num1 = 100;
        System.out.println(num1);
        //左边是long类型，右边是int类型
        //等号将右侧的int类型数值交到左边的long变量进行处理
        //这一行代码就发生了自动类型转换
        double num2 = 2.5f;
        System.out.println(num2);
        float num3 = 30L;
        System.out.println(num3);//不管浮点类型占用多少的字节，都比整数型容量大。
    }
}
