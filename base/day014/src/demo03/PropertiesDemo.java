package demo03;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //读取文件
        properties.load(new FileReader("D:\\study\\Git\\deom\\test\\base\\day014\\e.txt"));
        //获取key值集合
        Set<String> strings = properties.stringPropertyNames();
        //遍历集合
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
