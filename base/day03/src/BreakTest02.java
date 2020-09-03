/**
 * Created by wangxiaowei on 2020/9/3.
 * 使用break将标记的嵌套循环外层循环结束
 * 代码执行结果如下：
 *  *
 *  **
 *  ***
 */
public class BreakTest02 {
    public static void main(String[] args) {
        int i,j;
        //外层循环的作用的是打印几行
        AA: for (i = 1;i < 9;i++){
            //第二层循环的作用是打印多少个*
            for (j = 1; j <= i;j++){
                //当i==4的时候  结束外层循环
                if (i == 4){
                    break AA;
                }
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
