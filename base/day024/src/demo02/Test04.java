package demo02;

/**
 * Created by wangxiaowei on 2020/9/24.
 */
public class Test04 {
    public static int[] method(int length,JieKou5 j){
        return j.builderArr(length);
    }

    public static void main(String[] args) {
        int[] method = method(10, int[]::new);
        System.out.println(method.length);//10
    }
}
