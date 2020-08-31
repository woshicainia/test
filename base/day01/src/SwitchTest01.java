/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：接受用户的输入  1代表星期一。。。。。
 */
public class SwitchTest01 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入数字");
        int num = s.nextInt();
        switch (num){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期日");
                break;
            default :
                System.out.println("你输入的不合法");
                break;
        }
    }
}
