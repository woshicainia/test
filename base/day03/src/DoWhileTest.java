/**
 * Created by wangxiaowei on 2020/9/3.
 * 实现打印1~4之间的自然数
 * 代码执行结果如下：
 * x-->1
 *x-->2
 *x-->3
 *x-->4
 *循环结束x的值--->5
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("x-->" + x);
            x++;
        }while (x < 5);
        System.out.println("循环结束x的值--->" + x);
    }
}
