package day06.demo01;

/**
 * Created by wangxiaowei on 2020/9/6.
 * 题目：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class MathDemo02 {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        //通过强制类型转换将-10.8转换成-10，
        for (int i = (int)min;i < max;i++){
            //通过Math.abs（）方法取绝对值
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println(count);//9
    }
}
