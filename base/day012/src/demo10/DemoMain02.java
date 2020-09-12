package demo10;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain02 {
    public static void main(String[] args) {
        /*sum(20,92,(int a,int b)->{
            return a + b;
        });*/
        sum(30,34,(a,b)-> a + b);
    }
    public static void sum(int a,int b,PC c){
        int sum = c.sum(a,b);
        System.out.println(sum);
    }
}
