package demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class OutputStreamWriteDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day015\\src\\GBK.txt"),"gbk");
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
