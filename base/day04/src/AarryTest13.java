/**
 * Created by wangxiaowei on 2020/9/4.
 * 数组作为方法的返回值类型
 */
public class AarryTest13 {
    public static void main(String[] args) {
        int[] arr = calculate(1,2,3);
        //使用数组进行分别读取
        System.out.println("总和---》" + arr[0]);//总和---》6
        System.out.println("平均数---》" + arr[1]);//平均数---》2
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望返回，有一个数组装起来。
        int[] arr = {sum,avg};
        return arr;
    }
}
