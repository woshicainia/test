package demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Test01 {
    public static void main(String[] args) throws IOException {
        Math math = new Math();
        Class<? extends Math> aClass = math.getClass();
        Method[] methods = aClass.getMethods();
        int count = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(math);
                } catch (Exception e) {
                    count++;
                    bw.write(method.getName()+"方法出现了异常");
                    bw.newLine();
                    bw.write("方法出现异常的名称是"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("方法出现的异常原因是" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("共出现"+count+"次异常");
        bw.flush();
        bw.close();
    }
}
