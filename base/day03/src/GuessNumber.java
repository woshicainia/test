import java.util.Random;
import java.util.Scanner;

/**
 * Created by wangxiaowei on 2020/9/3.
 * 后台预先生成一个1-100之间的随机数，用户键盘录入猜数字
 *如果猜对了，打印“恭喜您，答对了”
 *如果猜错了
 ​*     *猜大了：打印“sorry，您猜大了!”
 ​*     *猜小了：打印“sorry，您猜小了!”
 ​*     *直到数字猜到为止
 * 代码执行结果如下：
 *请输入一个整数
 *22
 *sorry,你猜小了
 *33
 *sorry,你猜小了
 *44
 *sorry,你猜小了
 *55
 *sorry,你猜小了
 *66
 *sorry,你猜小了
 *77
 *sorry，你猜大了
 *70
 *sorry,你猜小了
 *72
 *恭喜你！！！终于猜对了
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int accept;
        Random r = new Random();
        int num = r.nextInt(100);
        while (true){
            accept = s.nextInt();
            if (num == accept){
                System.out.println("恭喜你！！！终于猜对了");
                break;
            }else if (num > accept){
                System.out.println("sorry,你猜小了");
            }else if (num < accept){
                System.out.println("sorry，你猜大了");
            }
        }
    }
}
