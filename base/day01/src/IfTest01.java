/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：假设本系统给定一个考生的成绩，成绩可能带有小数点，根据学生的成绩判断该生的成绩等级。
 * 【90-100】A 【60-90）B 【0-60）C
 */
public class IfTest01 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入你的成绩");
        double num = s.nextDouble();
        if (num >= 90 && num <= 100){
            System.out.println("你的成绩为A");
        }else if (num <90 && num >= 60){
            System.out.println("你的成绩为B");
        }else if (num >= 0 && num <60){
            System.out.println("你的成绩等级为C");
        }else{
            System.out.println("你输入的成绩不合法！！！");
        }
    }
}
