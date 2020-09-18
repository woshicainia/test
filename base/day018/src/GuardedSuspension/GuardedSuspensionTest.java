package GuardedSuspension;

/**
 * Created by wangxiaowei on 2020/9/18.
 */
public class GuardedSuspensionTest {
    public static void main(String[] args) {
        GuardedObject1 guardedObject = new GuardedObject1();
        new Thread(()->{
            //等待结果
            Object o = guardedObject.get(2000);
            System.out.println(o);//null
        }).start();
        new Thread(()->{
            //执行操作返回结果
            int sum = Sum.sum(4, 5);
            guardedObject.complete(sum);
        }).start();
    }
}
class GuardedObject1{
    private Object response;
    public Object get(long timeout){
        synchronized (this){
            long begin = System.currentTimeMillis();
            long passTime = 0;
            while (response == null){
                //waitTime为这一轮循环应该等待的时间
                long waitTime = timeout - passTime;
                //经历的时间超过超时时间就退出循环不再等待
                if (waitTime <= 0){
                    break;
                }
                try {
                    this.wait(waitTime);//避免虚假唤醒的情况，下一轮就不用等待timeout这么多时间了
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                passTime = System.currentTimeMillis() - begin;
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