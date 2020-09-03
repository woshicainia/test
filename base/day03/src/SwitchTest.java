import java.util.Scanner;

/**
 * Created by wangxiaowei on 2020/9/3.
 * 需求：实现计算器的加减乘除 加减乘除用1，2，3，4代替。
 * 代码执行结果如下：
 *请你输入一个整数
 10
 请你输入加减乘除用1，2，3，4代替
 4
 请你输入另一个数
 5
 */
public class SwitchTest {
    public static void main(String[] args) {
        //接受用户输入
        Scanner s = new Scanner(System.in);
        System.out.println("请你输入一个整数");
        int num1 = s.nextInt();
        System.out.println("请你输入加减乘除用1，2，3，4代替");
        int st = s.nextInt();
        System.out.println("请你输入另一个数");
        int num2 = s.nextInt();

        //匹配运算符号  输出运算结果
        switch (st){
            case 1 :
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2 :
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + "/" + num2 + "=" + (num1 /num2));
        }
    }
}
