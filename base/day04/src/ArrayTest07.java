/**
 * Created by wangxiaowei on 2020/9/4.
 * 数组的遍历及数组的元素累加和操作。
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,};
        int sum = 0;

        //遍历一维数组
        for (int i = 0; i < arr.length; i++) {
            //数组里每个元素相加
            sum += arr[i];
        }
        //打印一维数组的和
        System.out.println(sum);//150
        
        int[][] array = {{1,2},{3,5,8},{5,6,9,8}};
        int sum1 = 0;

        //遍历二维数组
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                //二维数组的累加
                sum1 += array[i][i1];
            }
        }
        //打印二维数组的和
        System.out.println(sum1);//47
    }
}
