import java.util.Scanner;
/**
 * Created by wangxiaowei on 2020/9/3.
 * if...else if....else if ...else的练习
 * 需求打印学生成绩的等级
 *输出结果为：
 *请输入你的成绩
 56
 你的成绩为C
 */
public class IfTest01 {
    public static void main(String[] args) {
        //接受键盘输入
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        double grade = s.nextDouble();

        //判断成绩等级 并打印成绩等级
        if (grade > 80){
            System.out.println("你的成绩为A");
        }else if (grade >= 60 && grade <= 80 ){
            System.out.println("你的成绩等级为B");
        }else if (grade <60){
            System.out.println("你的成绩为C");
        }else{
            System.out.println("你输入的成绩不合法");
        }
    }
}
