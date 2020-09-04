/**
 * Created by wangxiaowei on 2020/9/4.
 * 一维数组内存图
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        //定义一个长度为3的一维数组
        int[] arr = new int[3];
        System.out.println(arr);//一维数组的内存地址
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0

        arr[1] = 10;
        arr[2] = 20;
        System.out.println(arr);//一维数组的内存地址
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//10
        System.out.println(arr[2]);//20
    }
}
