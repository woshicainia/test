package demo02;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("D:\\study\\Git\\deom\\test\\base\\day014\\a.txt");
        /*int len = 0;
        while ((len = fileReader.read()) != -1){
            System.out.print((char)len);//abcdef你好你好#####
        }*/
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,len));//abcdef你好你好#####
        }
        fileReader.close();
    }
}
