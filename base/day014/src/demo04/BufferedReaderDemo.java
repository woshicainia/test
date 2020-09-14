package demo04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\study\\Git\\deom\\test\\base\\day014\\c.txt"));
        String s = null;
        //每次读一行数据
        while ((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
