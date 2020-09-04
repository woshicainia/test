/**
 * Created by wangxiaowei on 2020/9/4.
 * 数组元素反转
 * [15,25,3,6,9]
 * [9,6,3,25,15]
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        int[] arr ={15,25,3,6,9};
        //遍历原来的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=============================");

        //将原来的数组的元素位置进行一个交换
        for (int min = 0,max = arr.length-1;min < max;min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        //遍历现在的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
