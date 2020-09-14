package demo02;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\c.txt");
        fileWriter.write(97);
        fileWriter.flush();
        fileWriter.close();
    }
}
