package day08.demo09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);//2020年09月08日 21时24分40秒
        demo01();
    }

    private static void demo01() throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = s.parse("2020年09月08日 21时24分40秒");
        System.out.println(parse);//Tue Sep 08 21:24:40 CST 2020
    }
}
