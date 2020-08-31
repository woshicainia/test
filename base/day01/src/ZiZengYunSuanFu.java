/**
 * Created by wangxiaowei on 2020/8/30.
 * 自增运算符:++
 *      1.在前先加一，在赋值
 *      2.在后，先赋值再加一，--同理；
 *      3.注意事项：只有变量才能使用自增、自减运算符，常量不可发生改变，所以不能用。
 */
public class ZiZengYunSuanFu {
    public static void main(String[] args) {
        int i =   1;
        System.out.println(i);

        int j;
        j = i++;
        System.out.println(j);
        //先赋值在加一

        j = ++i;
        System.out.println(j);
        System.out.println(i);
        //先加一在赋值
        //30++；是错的
    }
}
