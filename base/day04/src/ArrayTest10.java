/**
 * Created by wangxiaowei on 2020/9/4.
 *  数组索引越界异常
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        int[] arr = {10 , 15, 20};
        System.out.println(arr[0]);//10
        System.out.println(arr[1]);//15
        System.out.println(arr[2]);//20

        System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException
    }
}
