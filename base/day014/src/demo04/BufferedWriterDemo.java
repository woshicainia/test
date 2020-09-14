package demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\c.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("我是一名程序员");
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
