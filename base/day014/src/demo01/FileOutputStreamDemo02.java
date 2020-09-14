package demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day014\\b.txt",true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
