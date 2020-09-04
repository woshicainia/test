/**
 * Created by wangxiaowei on 2020/9/4.
 * 空指针异常
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr;
        arr = null;
        //System.out.println(arr[0]);//java.lang.NullPointerException
        arr = new int[3];
        System.out.println(arr[1]);
    }
}
