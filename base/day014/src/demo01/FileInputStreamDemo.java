package demo01;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\study\\Git\\deom\\test\\base\\day014\\a.txt");
        int num = 0;
        while ((num = fileInputStream.read()) != -1){
            System.out.println(num);
        }
        fileInputStream.close();
    }
}
