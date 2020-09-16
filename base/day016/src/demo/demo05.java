package demo;

import java.util.ArrayList;
public class demo05 {
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
class Threadsafe {

    public void method1(int loopNunber){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < loopNunber; i++) {
            method2(list);
            method3(list);
        }
    }
    private void method2(ArrayList<Integer> list){
        list.add(1);
    }
    private void method3(ArrayList<Integer> list){
        list.remove(0);
    }
}
