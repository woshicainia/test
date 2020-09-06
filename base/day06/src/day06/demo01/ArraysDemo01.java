package day06.demo01;

import java.util.Arrays;

/**
 * Created by wangxiaowei on 2020/9/6.
 * public static String toString(数组)：将参数的数组变成字符串（按默认格式[元素1，元素2，元素3.....])
   public static void sort(数组):按照默认升序（从小到大）对数组的元素进行排序。
 */
public class ArraysDemo01 {
    public static void test(){
        int[] arr = {1,2,5,6,3,8,7};
        String s = Arrays.toString(arr);
        System.out.println(s);//[1, 2, 5, 6, 3, 8, 7]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 5, 6, 7, 8]
    }
}
