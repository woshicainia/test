package demo02;

import java.io.File;
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("day013\\src");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        System.out.println(file);
        for (File file1 : file.listFiles()) {
            if (file1.isDirectory()){
                getAllFile(file1);
            }else {
                System.out.println(file1);
            }
        }
    }
}
