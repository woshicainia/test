/**
 * Created by wangxiaowei on 2020/9/2.
 * Scanner类练习实现用户数字字符串接受
 * 输出结果是：
 * 请您输入一个整数
 23
 请您输入一个字符串
 abcd
 您输入的整数是23,您输入的字符串是abcd.
 */
public class ScannerTest {
    public static void main(String[] args) {
        //创建Scanner引用类型的变量
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请您输入一个整数");

        //接受用户输入的数字
        int num = s.nextInt();
        System.out.println("请您输入一个字符串");

        //接受用户输入的字符串
        String st = s.next();

        //打印用户输入的数和字符串
        System.out.println("您输入的整数是" + num + "," + "您输入的字符串是" + st + ".");
    }
}
