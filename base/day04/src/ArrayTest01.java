/**
 * Created by wangxiaowei on 2020/9/4.
 * 定义数组以及访问数组中的元素
 * 程序运行结果如下：
 * 0
 * 0
 * 0
 * 3
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array = new int[3];//创建数组对象
        System.out.println(array[0]);//访问数组中第一个元素
        System.out.println(array[1]);//访问数组中第二个元素
        System.out.println(array[2]);//访问数组中第三个元素
        System.out.println(array.length);//数组的长度
    }
}
