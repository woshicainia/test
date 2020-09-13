package demo01;

import java.io.File;
public class FileDemo05 {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File file = new File("day013\\src");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.print(file1 + " ");//day013\src\demo01\FileDemo.java
        }
    }

    private static void show01() {
        File file = new File("day013\\src\\demo01");
        String[] list = file.list();
        for (String s : list) {
            System.out.print(s + "  ");//FileDemo.java  FileDemo01.java  FileDemo02.java  FileDemo03.java  FileDemo04.java  FileDemo05.java
        }
    }
}
