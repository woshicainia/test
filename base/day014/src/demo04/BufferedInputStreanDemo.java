package demo04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedInputStreanDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\study\\Git\\deom\\test\\base\\day014\\c.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        /*int len = 0;
        while ((len = bufferedInputStream.read()) != -1){
            System.out.println(len);
        }*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));//abcdefg
        }
        bufferedInputStream.close();
    }
}
