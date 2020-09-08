package day08.demo09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BriDay {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date bir = simpleDateFormat.parse("1997-10-02");
        long time = bir.getTime();
        long time1 = new Date().getTime();
        long l = time1 - time;
        System.out.println(l/24/60/60/1000);//8377
    }
}
