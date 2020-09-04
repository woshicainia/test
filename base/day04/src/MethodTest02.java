/**
 * Created by wangxiaowei on 2020/9/4.
 * 方法的重载：进行求和
 * 程序执行结果如下：
 * sum1 =3
 *sum2 = 6
 *sum3 =2.5
 */
public class MethodTest02 {
    public static void main(String[] args) {
        //下面针对求和方法的调用
        int sum1 = add(1,2);
        int sum2 = add(1,2,3);
        double sum3 = add(1.2,1.3);
        //输出求和结果
        System.out.println("sum1 =" + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 =" + sum3);
    }

    //定义一个求两个整数的和
    public static int add (int a, int b){
        int temp = a + b;
        return temp;
    }

    //定义一个求三个数的和的方法
    public static int add (int a,int b,int c){
        int temp = a + b + c;
        return temp;
    }

    //定义一个求两个小数的和
    public static double add (double a,double b){
        double temp = a + b;
        return temp;
    }
}
