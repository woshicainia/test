/**
 * Created by wangxiaowei on 2020/9/4.
 * 定义了一个求矩形面积的方法
 * 程序执行结果为：
 * this area is15
 */
public class MethodTest01 {
    public static void main(String[] args) {
        //调用getArea方法
        int area = getArea(3,5);
        System.out.println("this area is" + area);
    }

    //定义一个求长方形面积的方法，接收长a,宽b。
    public static int getArea (int a,int b){
        //用temp记住运算结果
        int temp = a * b;
        //返回temp值。
        return temp;
    }

}
