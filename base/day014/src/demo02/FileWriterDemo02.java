package demo02;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\d.txt");
        char[] chars = {'中','国','人'};
        fileWriter.write(chars);//中国人
        fileWriter.write(chars,0,2);//中国
        fileWriter.write("黑马程序员");//黑马程序员
        fileWriter.write("传智播客",0,2);//传智
        fileWriter.close();
    }
}
