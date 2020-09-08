package day08.demo08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoMain {
    public static void main(String[] args) {
        Person person = new Person("张三",19);
        String s = person.toString();
        System.out.println(s);
        Random r = new Random();
        //没有重写toString方法
        System.out.println(r);//java.util.Random@a14482
        Scanner scanner = new Scanner(System.in);
        //重写toString方法
        System.out.println(scanner);//java.util.Scanner[delimiters=\p{javaWhitespace}+][
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        //重写toString方法
        System.out.println(arrayList);//[1, 2]
        Person person1 = new Person("迪丽热巴",20);
        Person person2 = new Person("迪丽热巴",20);
        System.out.println(person1.equals(person2));
    }
}
