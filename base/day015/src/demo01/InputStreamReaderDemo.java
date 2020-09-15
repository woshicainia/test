package demo01;

import java.io.*;
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\study\\Git\\deom\\test\\base\\day015\\src\\GBK.txt"),"gbk");
        int len = 0;
        while ((len = inputStreamReader.read()) != -1){
            System.out.println((char)len);
        }
        inputStreamReader.close();
    }
}
