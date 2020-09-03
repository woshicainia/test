/**
 * Created by wangxiaowei on 2020/9/3.
 * 通过案例对案例对自然数1-4进行求和
 * 代码执行如下：
 *自然数1-4的求和结果为-->10
 */
public class ForTest {
    public static void main(String[] args) {
        int i;
        int count = 0;
        for (i = 1; i < 5;i++){
            count += i;
        }
        System.out.println("自然数1-4的求和结果为-->" + count);
    }
}
