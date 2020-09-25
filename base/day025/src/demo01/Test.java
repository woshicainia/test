package demo01;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
@Pro(className = "demo01.Student",methodName = "show")
public class Test {
    public static void main(String[] args) throws Exception {
        Class<Test> cls1 = Test.class;
        Pro pro = cls1.getAnnotation(Pro.class);
        String className = pro.className();
        String methodName = pro.methodName();
        Class<?> cls = Class.forName(className);

        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }
}
