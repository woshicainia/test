package demo;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
public class Test {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties pro = new Properties();
        ClassLoader classLoader = Test.class.getClassLoader();
        //加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //获取配置文件中的定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //加载类进内存
        Class cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
