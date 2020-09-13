package demo02;

/**
 * Created by wangxiaowei on 2020/9/13.
 * 使用递归计算1-10的和
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = a(10);
        System.out.println(a);
    }

    private static int a(int i) {
        if (i == 1){
            return i;
        }
        return i + a(i - 1);
    }
}
