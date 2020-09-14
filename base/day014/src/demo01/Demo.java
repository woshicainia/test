package demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\图片\\IO流.png");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IO流.png");
        byte[] bytes = new byte[1024];
        int num = 0;
        while ((num = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,num);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
