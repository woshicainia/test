/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：假设系统给定一个人的年龄，根据年龄来判断这个人处于生命的哪个阶段，【0-5）幼儿【5-10】少年【11-18】青少年【19-35】成年人
 * 【36-55】中年【56-150】老年
 */
public class IfTest02 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("本系统可以判断你的年龄处在哪个阶段---请输入你的年龄");
        int age = s.nextInt();
        if (age < 5 && age >= 0){
            System.out.println("你的年龄处于生命的幼儿阶段");
        }else if (age >= 5 && age <= 10){
            System.out.println("你的年龄处于生命的少年阶段");
        }else if (age >= 11 && age <= 18){
            System.out.println("你的年龄处于生命的青少年阶段");
        }else if (age >= 19 && age <= 35){
            System.out.println("你的年龄处于生命的成年人阶段");
        }else if (age >= 36 && age <= 55){
            System.out.println("你的年龄处于生命的中年人阶段");
        }else if (age >= 56 && age <= 150){
            System.out.println("你的年龄处于生命的老年人阶段");
        }else{
            System.out.println("你输入的年龄不合法");
        }
    }
}
