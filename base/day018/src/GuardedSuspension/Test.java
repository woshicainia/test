package GuardedSuspension;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            new Person().start();
        }
        Thread.sleep(1000);
        for (Integer id : Mailboxes.getIds()) {
            new Postman(id,"内容" + id).start();
        }
    }
}
class Person extends Thread{
    @Override
    public void run() {
        //收信
        GuardedObject2 guardedObject2 = Mailboxes.createGuardedObject();
        System.out.println("开始收信id:" + guardedObject2.getId());
        Object mail = guardedObject2.get(5000);
        System.out.println("收到信id:" + guardedObject2.getId() + "收到信内容：" + mail);
    }
}
class Postman extends Thread{
    private int id;
    private String mail;
    public Postman(int id,String mail){
        this.id = id;
        this.mail = mail;
    }
    @Override
    public void run() {
        GuardedObject2 guardedObject2 = Mailboxes.getGuardedObject(id);
        System.out.println("送信id:" + id + "内容："+ mail);
        guardedObject2.complete(mail);
    }
}
//信箱
class Mailboxes{
    private static Map<Integer,GuardedObject2> boxes = new Hashtable();
    // 产生唯一 id
    private static int id = 1;
    private static synchronized int generateId(){
        return id++;
    }
    public static GuardedObject2 getGuardedObject(int id){
        //根据id获取到box并删除对应的key和value,避免堆内存爆了
        return boxes.remove(id);
    }
    public static GuardedObject2 createGuardedObject(){
        GuardedObject2 go = new GuardedObject2(generateId());
        boxes.put(go.getId(),go);
        return go;
    }
    public static Set<Integer> getIds(){
        return boxes.keySet();
    }
}
class GuardedObject2{
    private int id;

    public GuardedObject2(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

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