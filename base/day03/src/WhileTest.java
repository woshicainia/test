/**
 * Created by wangxiaowei on 2020/9/3.
 * 实现打印1~4之间的自然数
 * 代码执行结果如下：
 *i--->1
 *i--->2
 *i--->3
 *i--->4
 * 循环后i的值为5
 */
public class WhileTest {
    public static void main(String[] args) {
        //定义i的值为1
        int i = 1;
        while (i < 5){//循环条件
            System.out.println("i--->" + i);//条件成立打印i的值
            i++;//i自增一
        }
        System.out.println("循环后i的值为" + i);
    }
}
