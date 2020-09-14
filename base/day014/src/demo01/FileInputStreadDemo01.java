package demo01;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreadDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\study\\Git\\deom\\test\\base\\day014\\a.txt");
        byte[] bytes = new byte[1024];
        int num = 0;
        while ((num = fileInputStream.read(bytes))!= -1){
            System.out.println(new String(bytes,0,num));//abcdef
        }
        fileInputStream.close();
    }
}
