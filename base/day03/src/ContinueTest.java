/**
 * Created by wangxiaowei on 2020/9/3
 * 对1~100之内的奇数求和，.
 * 代码执行结果如下：
 * 1-100内的奇数和为-->2500
 */
public class ContinueTest {
    public static void main(String[] args) {
        int i;
        int sum = 0;//和
        //for循环的作用是给i赋值从1到100
        for (i = 1;i < 100;i++) {
            //判断i是偶数吗  如果是就结束本次循环 开始下一次的循环
            if (i % 2 == 0){
                continue;
            }
            //1-100的奇数的和
            sum += i;
        }
        System.out.println("1-100内的奇数和为-->" + sum);
    }
}
