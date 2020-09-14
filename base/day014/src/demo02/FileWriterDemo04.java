package demo02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo04 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\d.txt");
                FileWriter fileWriter1 = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\d.txt")) {
            for (int i = 0; i < 10; i++) {
                fileWriter.write("hellowrold" + i + "\r\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
