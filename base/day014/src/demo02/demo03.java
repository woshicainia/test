package demo02;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class demo03 {
    public static void main(String[] args) throws IOException {
        //创建集合放入数据
        Properties properties = new Properties();
        properties.setProperty("迪丽热巴","15");
        properties.setProperty("古力娜扎","19");
        properties.setProperty("马尔扎哈","25");
        //创建字符输出流
        FileWriter fileWriter = new FileWriter("D:\\study\\Git\\deom\\test\\base\\day014\\e.txt");
        //将数据存储到硬盘中
        properties.store(fileWriter,"");
        fileWriter.close();
    }
}
