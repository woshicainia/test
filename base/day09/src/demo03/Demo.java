package demo03;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class Demo {
    public static void main(String[] args) {
        int add = sum(2,3,4,5);
        System.out.println(add);

    }
    //定义一个0-n个整数的求和方法
    public static int sum(int...arr){
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }
}
