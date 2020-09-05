package demo02;

import java.util.Scanner;
import java.util.logging.XMLFormatter;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 匿名对象作为方法的参数和方法的返回值
 */
public class Anonymous {
    public static void main(String[] args) {

        methodParam(new Scanner(System.in));
        int num = methodReturn().nextInt();
        System.out.println("你输入的数字是" + num);
    }

    public static void methodParam(Scanner sc){
        System.out.println("请输入你的名字");
        String name = sc.next();
        System.out.println("你的名字是：" + name);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
