package demo;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
public class Test06 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                TemporalAccessor date = formatter.parse("2020-09-20");
                System.out.println(date);
            }).start();
        }
    }
}
