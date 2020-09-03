import java.util.Scanner;

/**
 * Created by wangxiaowei on 2020/9/3.
 * 要判断一周中的某一天是否为工作日，使用1-7来表示星期一到星期日，当输入的数字为1.2.3.4.5时就视为工作日，否则就视为休息日看，
 * 执行代码如下：
 *请输入今天星期几
  *3
  *今天是工作日
 */
public class CaseTest {
    public static void main(String[] args) {
        //接受用户键盘输入
        Scanner s = new Scanner(System.in);
        System.out.println("请输入今天星期几");
        int i = s.nextInt();

        //判断是工作日，还是休息日。
        switch (i){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是休息日");
                break;
        }
    }
}
