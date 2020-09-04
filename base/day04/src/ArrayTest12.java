/**
 * Created by wangxiaowei on 2020/9/4.
 * 数组作为方法的参数，传递的是数组的地址
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,9,8,8,4};
        System.out.println(arr);//[I@16d3586
        printArr(arr);
    }
    public static void printArr(int[] arr){//这里接收到的是arr数组的地址值
        System.out.println(arr);//[I@16d3586
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
