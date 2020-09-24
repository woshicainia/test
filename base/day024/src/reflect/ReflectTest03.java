package reflect;


import java.lang.reflect.Method;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        /*
        返回获取一个方法：
        * public Method getMethod(String name, Class<?>... parameterTypes)//获取public 修饰的方法
        * public Method getDeclaredMethod(String name, Class<?>... parameterTypes) // 获取任意的方法，包含
        私有的
        参数1: name 要查找的方法名称； 参数2： parameterTypes 该方法的参数类型
        返回获取多个方法：
        * public Method[] getMethods() //获取本类与父类中所有public 修饰的方法
        * public Method[] getDeclaredMethods() //获取本类中所有的方法(包含私有的)
         */
        Class personClass = Person.class;
        Method eat = personClass.getDeclaredMethod("eat");
        Object p = personClass.newInstance();
        eat.invoke(p);//eat.....
        Method eat1 = personClass.getDeclaredMethod("eat", String.class);
        eat1.invoke(p,"饭");//eat...饭
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
            method.setAccessible(true);
            String name = method.getName();
            System.out.println(name);
        }
        String name = personClass.getName();
        System.out.println(name);//reflect.Person
    }
}
