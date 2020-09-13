package demo02;

import java.io.File;
import java.io.FileFilter;
public class Demo05 {
    public static void main(String[] args) {
        File file = new File("day013\\src");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        for (File file1 : file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().endsWith(".java");
            }
        })) {
            if (file1.isDirectory()){
                getAllFile(file1);
            }else {
                String s = file1.toString();
                if (s.endsWith(".java"))
                System.out.println(file1);
            }
        }
    }
}
