package demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wangxiaowei on 2020/9/20.
 */
public class Test02 {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(5);
        System.out.println(i.updateAndGet(value -> value * 7));
    }
}
