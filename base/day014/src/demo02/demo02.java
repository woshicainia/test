package demo02;

import java.util.Properties;
import java.util.Set;

public class demo02 {
    public static void main(String[] args) {
        //创建集合放入数据
        Properties properties = new Properties();
        properties.setProperty("迪丽热巴","15");
        properties.setProperty("古力娜扎","19");
        properties.setProperty("马尔扎哈","25");
        //获取key集合
        Set<String> strings = properties.stringPropertyNames();
        //遍历集合
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
