package demo01;

import java.io.File;

/**
 * Created by wangxiaowei on 2020/9/13.
 * static String
 pathSeparator
 与系统相关的路径分隔符字符，为方便起见，表示为字符串。
 static char
 pathSeparatorChar
 与系统相关的路径分隔符。
 static String
 separator
 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
 static char
 separatorChar
 与系统相关的默认名称分隔符。
 */
public class FileDemo {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//;  分号
        String separator = File.separator;
        System.out.println(separator);// \   反斜杠
    }
}
