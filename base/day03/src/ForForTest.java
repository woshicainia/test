/**
 * Created by wangxiaowei on 2020/9/3.
 * 实现使用“*”打印直角三角形
 *   *
 *   **
 *   ***
 *   ****
 */
public class ForForTest {
    public static void main(String[] args) {
        int i,j;

        //第一层for循环  作用是打印4行
        for (i = 1;i < 5;i++){
            //第二层的for循环 每行打印多少个*
            for (j = 1; j < i + 1;j++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
