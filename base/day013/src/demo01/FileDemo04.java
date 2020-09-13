package demo01;

import java.io.File;
import java.io.IOException;

/**
 * Created by wangxiaowei on 2020/9/13.
 * | `boolean` | `mkdir()` 创建由此抽象路径名命名的目录。                     |
 | `boolean` | `mkdirs()` 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。 |
 | `boolean` | `createNewFile()` 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。 |
 | `boolean` | `delete()` 删除由此抽象路径名表示的文件或目录。 |



 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        show04();
    }

    private static void show04() {
        //boolean` | `delete()` 删除由此抽象路径名表示的文件或目录。
        File file = new File("1.txt");
        File file1 = new File("AAA");
        System.out.println(file.delete());//true
        System.out.println(file1.delete());//true
    }

    private static void show03() {
        //boolean` | `mkdirs()` 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
        File file = new File("AAA\\AAA\\DDD");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);//true
    }

    private static void show02() {
        //| `boolean` | `mkdir()` 创建由此抽象路径名命名的目录。
        File file = new File("AAA");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);//true
    }

    private static void show01() throws IOException {
        //| `boolean` | `createNewFile()` 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        File file = new File("1.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);//true;
    }
}
