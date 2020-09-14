package demo01;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("D:\\study\\Git\\deom\\test\\base\\day014\\a.txt");
            fileOutputStream.write(97);
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
