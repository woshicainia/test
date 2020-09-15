package demo01;

import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\study\\Git\\deom\\test\\base\\day015\\src\\GBK.txt"),"gbk");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day015\\src\\UTF-8.txt"),"utf-8");
        int len = 0;
        while ((len = inputStreamReader.read()) != -1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
