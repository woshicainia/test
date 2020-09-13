package demo01;

import java.io.File;

/**
 * Created by wangxiaowei on 2020/9/13.
 * File(File parent, String child)
 从父抽象路径名和子路径名字符串创建新的 File实例。
 File(String pathname)
 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 File(String parent, String child)
 从父路径名字符串和子路径名字符串创建新的 File实例。
 File(URI uri)
 通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("D:\\Blog\\source\\_posts");
        System.out.println(file);//D:\Blog\source\_posts

        File file1 = new File("d:\\", "dianzishu.txt");
        System.out.println(file1);//d:\dianzishu.txt

        File file2 = new File("d:\\");
        File file3 = new File(file2,"a.txt");//d:\dianzishu.txt

    }
}
