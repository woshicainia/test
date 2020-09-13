package demo02;

/**
 * Created by wangxiaowei on 2020/9/13.
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = a(5);
        System.out.println(a);//120
    }

    private static int a(int i) {
        if (i == 1){
            return 1;
        }
        return i * a(i - 1);
    }
}
