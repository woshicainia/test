package demo;

import java.util.ArrayList;
public class demo04 {
    static final int THREAD_NUMBER = 2;
    static final int LOOP_NUMBER = 200;
    public static void main(String[] args) {
        Threadsafe test = new Threadsafe();
        for (int i = 0; i < THREAD_NUMBER; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.method1(LOOP_NUMBER);
                }
            },"thread" + (i + 1)).start();
        }
    }
}
class ThreadUnsafe{
    ArrayList<Integer> list = new ArrayList<>();
    public void method1(int loopNunber){
        for (int i = 0; i < loopNunber; i++) {
            method2();
            method3();
        }
    }
    private void method2(){
        list.add(1);
    }
    private void method3(){
        list.remove(0);
    }
}