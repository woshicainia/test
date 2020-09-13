package demo02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo06 {
    public static void main(String[] args) {
        File file = new File("day013\\src");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
        for (File file1 : file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.endsWith(".java");
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
