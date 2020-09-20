package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                try {
                    Date parse = format.parse("2020-09-20");
                    System.out.println(parse);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
