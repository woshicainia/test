/**
 * Created by wangxiaowei on 2020/8/30.
 *  需求：假设本系统给定一个考生的成绩，成绩可能带有小数点，根据学生的成绩判断该生的成绩等级。
 *  [0-100]A [80-90]B [70-80]C  考试中可能带有小数，必须使用switch
 *  窍门：成绩/10
 */
public class SwitchTest03 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入你的成绩[0-100]A [80-90]B [70-80]C");
        double chengJi = s.nextDouble();
        int i = (int)chengJi / 10;
        switch(i){
            case 7 :
                System.out.println("你的成绩等级为C");
                break;
            case 8 :
                System.out.println("你的成绩等级为B");
                break;
            case 9:
                System.out.println("你的成绩等级为A");
                break;
            default:
                System.out.println("你输入的成绩不合法");
        }
    }
}
