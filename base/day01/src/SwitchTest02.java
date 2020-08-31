/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：实现简单计算器功能 1代表加  2代表减 3代表乘 4代表除 5代表取模
 * Error:(14, 15) java: -source 1.3 中不支持 switch 中存在字符串
 (请使用 -source 7 或更高版本以允许 switch 中存在字符串)
 */
public class SwitchTest02 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = s.nextInt();
        System.out.println("请输入算数运算符1代表加  2代表减 3代表乘 4代表除 5代表取模");
        int str = s.nextInt();
        System.out.println("请输入一个整数");
        int num2 = s.nextInt();
        switch(str){
            case 3 :
                System.out.println(num1 * num2);
                break;
            case 1 :
                System.out.println(num1 + num2);
                break;
            case 2 :
                System.out.println(num1 - num2);
                break;
            case 4 :
                System.out.println(num1 / num2);
                break;
            case 5 :
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("你输入的不合法");
                break;
        }
    }
}
