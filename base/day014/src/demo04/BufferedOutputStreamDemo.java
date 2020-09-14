package demo04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day014\\c.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("数据写入到硬盘中".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
}
