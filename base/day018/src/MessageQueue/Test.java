package MessageQueue;

import java.util.LinkedList;
public class Test {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(2);
        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(()->{
                queue.put(new Message(id,id ));
            },"生产者" + id).start();
        }
        new Thread(()->{
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.take();
            }
        },"消费者").start();
    }
}
//消息队列类，Java线程之间通信
class MessageQueue{
    //消息的队列集合
    LinkedList<Message> list = new LinkedList<Message>();
    //队列的容量
    private int capcity;

    public MessageQueue(int capcity) {
        this.capcity = capcity;
    }
    //获取消息
    public Message take(){
        // 检查队列是否为空
        synchronized (list){
            while (list.isEmpty()){
                try {
                    System.out.println(Thread.currentThread().getName()+"队列为空，消费者进入等待");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // 从队列头部获取消息并返回
            Message message = list.removeFirst();
            System.out.println(Thread.currentThread().getName()+"以消费消息" + message);
            list.notifyAll();
            return message;
        }
    }
    //存消息
    public void put(Message message){
        synchronized (list){
            // 检查对象是否已满
            while (list.size() == capcity){
                System.out.println(Thread.currentThread().getName() + "队列已满，生产者进入等待");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 将消息加入队列尾部
            list.addLast(message);
            System.out.println(Thread.currentThread().getName() + "以生产消息");
            list.notifyAll();
        }
    }
}
final class Message{
    private int id;
    private Object value;

    public Message(int id, Object value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}