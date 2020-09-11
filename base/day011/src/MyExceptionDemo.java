import demo02.MyException;

import java.util.Scanner;
public class MyExceptionDemo {
    static String[] useName = {"张三","李四","王五"};
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String name = scanner.next();
        for (String s : useName) {
            if (s.equals(name)){
                throw new MyException("亲，您输入的用户名已经被注册");
            }
        }
        System.out.println("恭喜你注册成功");
    }
}
