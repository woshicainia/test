package GuardedSuspension;

/**
 * Created by wangxiaowei on 2020/9/18.
 */
public class Sum {
    public static int sum(int a,int b){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }
}
