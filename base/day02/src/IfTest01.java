/**
 * Created by wangxiaowei on 2020/9/2.
 * 定义一个变量i，字面值为5，如果小于10，就加一，打印i的值
 * 执行结果如下：
 *i-->6
 */
public class IfTest01 {
    public static void main(String[] args) {
        int i = 5;
        if (i <10){
            i++;
        }
        System.out.println("i-->" + i);
    }
}
