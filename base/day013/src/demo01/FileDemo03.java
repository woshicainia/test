package demo01;

import java.io.File;
public class FileDemo03 {
    public static void main(String[] args) {
        File file = new File("D:\\study\\Git\\deom\\test\\base\\day013\\src\\demo01");
        //判断路径是否存在
        if (file.exists()){
            //判断路径结尾的是文件夹还是文件
            System.out.println(file.isDirectory());//true
            System.out.println(file.isFile());//false
        }
    }
}
