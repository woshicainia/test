/**
 * Created by wangxiaowei on 2020/9/3.
 *实现将当变量x的值为3时，使用break语句跳出循环
 * x--->1
 *x--->2
 *x--->3
 * 循环结束后x--->3
 */
public class BreakTest {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 4){
            System.out.println("x--->" + x);
            //当x==3的时候跳出本次循环
            if (x == 3){
                break;
            }
            //当x==3的时候 循环直接就结束了  所以x最后的结果就是3
            //这段代码最后没有被执行
            x++;
        }
        System.out.println("循环结束后x--->"+x);
    }
}
