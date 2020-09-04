/**
 * Created by wangxiaowei on 2020/9/4.
 * 获取数组中元素的最值。
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一个数组
        int[] arr = {4,5,3,9,22,3};
        int max = arr[0];

        //遍历数组
        for (int i = 1; i < arr.length; i++) {
            //选出最大值
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //打印最大值
        System.out.println("最大值是" + max);//22
    }
}
