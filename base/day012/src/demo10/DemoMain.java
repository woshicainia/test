package demo10;

/**
 * Created by wangxiaowei on 2020/9/12.
 */
public class DemoMain {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeCook() {
                System.out.println("吃饭了");
            }
        });
        invokeCook(()->{
            System.out.println("吃饭了");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makeCook();
    }
}
