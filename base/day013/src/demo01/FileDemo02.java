package demo01;

import java.io.File;

/**
 * Created by wangxiaowei on 2020/9/13.
 * String  getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
 String  getPath() 将此抽象路径名转换为路径名字符串。
 String  getName() 返回由此抽象路径名表示的文件或目录的名称。获取的是构造方法传递路径的结尾部分   文件/文件夹
 long length():返回此File表示的文件的长度。获取的是构造方法指定的文件的大小，以字节为单位。
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File file = new File("FileDemo02.java");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);//D:\study\Git\deom\test\base\FileDemo02.java

        File file1 = new File("D:\\study\\Git\\deom\\test\\base\\FileDemo02.java");
        String parent = file1.getParent();
        System.out.println(parent);//D:\study\Git\deom\test\base

        File file2 = new File("D:\\study\\Git\\deom\\test\\base");
        String name = file2.getName();
        System.out.println(name);//base

        File file3 = new File("D:\\study\\Git\\deom\\test\\base\\day013\\src\\demo01\\FileDemo01.java");
        long length = file3.length();
        System.out.println(length);//955
    }
}
