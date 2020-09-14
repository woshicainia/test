package demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day014\\b.txt");
        byte[] bytes = {65,66,67,68,69};//ABCDE
        fileOutputStream.write(bytes);
        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));//[-28, -67, -96, -27, -91, -67]
        fileOutputStream.write(bytes1);
        fileOutputStream.close();
    }
}
