/**
 * Created by wangxiaowei on 2020/8/30.
 * 变量只有赋值后才能被访问
 */
public class VarTest02 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i = 100;//重新赋值
        System.out.println(i);
        int j;
        //Error
        //只有赋值后才能被访问
        //System.out.println(j);
    }
}
