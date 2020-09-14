package demo02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\d.txt");
        for (int i = 0; i < 10; i++) {
            fileWriter.write("hellowrold" + i +"\r\n");
        }
        fileWriter.close();
    }
}
