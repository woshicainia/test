package day08.demo09;

import java.util.Calendar;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);
        int date = calendar.get(calendar.DATE) + 1;
        int hour = calendar.get(calendar.HOUR );
        System.out.println(year);//2020
        System.out.println(month);//9
        System.out.println(date);//8
        System.out.println(hour);//10
        Date d = calendar.getTime();
        System.out.println(d);//Tue Sep 08 22:33:38 CST 2020
    }
}
