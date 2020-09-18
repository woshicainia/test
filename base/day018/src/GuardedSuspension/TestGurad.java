package GuardedSuspension;

import sun.security.provider.Sun;

/**
 * Created by wangxiaowei on 2020/9/18.
 */
public class TestGurad {
    public static void main(String[] args) {
        GuardedObject guardedObject = new GuardedObject();
        new Thread(()->{
            //等待结果
            Object o = guardedObject.get();
            int sum = (int)o;
            System.out.println(sum);//9
        }).start();
        new Thread(()->{
            //执行操作返回结果
            int sum = Sum.sum(4, 5);
            guardedObject.complete(sum);
        }).start();
    }
}
class GuardedObject{
    private Object response;
    public Object get(){
        synchronized (this){
            while (response == null){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return response;
        }
    }
    public void complete(Object response){
        synchronized (this){
            this.response = response;
            this.notifyAll();
        }
    }
}