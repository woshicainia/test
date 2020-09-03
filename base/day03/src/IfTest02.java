/**
 * Created by wangxiaowei on 2020/9/3.
 * 求两个数x,y中的较大者，如果用if....else语句来实现和用三元运算符来实现
 * 代码执行结果如下：
 *最大值为-->10
 */
public class IfTest02 {
    public static void main(String[] args) {
        int i = 5;
        int y = 10;

        //这里是通过if语句来实现最大值的判定
       /* if (i > y){
            System.out.println("最大值为-->" + i);
        }else{
            System.out.println("最大值为-->" + y);
        }*/

       //通过三元运算符来求出最大值
        int max = i > y ? i : y;
        System.out.println("最大值为-->" + max);
    }
}
