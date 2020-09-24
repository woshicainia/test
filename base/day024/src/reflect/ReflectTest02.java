package reflect;

import java.lang.reflect.Constructor;
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        /*
        返回一个构造方法：
            * public Constructor<T> getConstructor(Class<?>... parameterTypes) 获取public修饰, 指定参数类型所对应的构造方法
            * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 获取指定参数类型所对应的构造方法(包含私有的)
        返回多个构造方法
            * public Constructor<?>[] getConstructors() 获取所有的public 修饰的构造方法
            * public Constructor<?>[] getDeclaredConstructors() 获取所有的构造方法(包含私有的)
         */
        Class cls = Person.class;
        Constructor constructor = cls.getConstructor(String.class, int.class);
        System.out.println(constructor);//public reflect.Person(java.lang.String,int)
        Object person = constructor.newInstance("张三", 33);
        System.out.println(person);//Person{name='张三', age=33, a='null', b='null', c='null', d='null'}
        Object person1 = cls.newInstance();
        System.out.println(person1);//Person{name='null', age=0, a='null', b='null', c='null', d='null'}
        constructor.setAccessible(true);//暴力反射
    }
}
