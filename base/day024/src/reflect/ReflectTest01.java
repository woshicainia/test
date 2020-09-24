package reflect;

import java.lang.reflect.Field;
public class ReflectTest01 {
    public static void main(String[] args) throws Exception {
        /*
        返回一个成员变量
            * public Field getField(String name) 获取指定的public修饰的变量
            * public Field getDeclaredField(String name) 获取指定的任意变量(包含私有)
         返回多个成员变量
            * public Field[] getFields() 获取所有public修饰的变量
            * public Field[] getDeclaredFields() 获取所有的变量 (包含私有)
         */
        Class cls = Person.class;
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);//public java.lang.String reflect.Person.a
        }
        Field a = cls.getField("a");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);//null
        a.set(p,"张三");
        System.out.println(p);//Person{name='null', age=0, a='张三', b='null', c='null', d='null'}
        //public Field[] getDeclaredFields() 获取所有的变量 (包含私有)
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        Object o1 = name.get(p);
        System.out.println(o1);//null
        name.set(p,"李四");
        System.out.println(p);//Person{name='李四', age=0, a='张三', b='null', c='null', d='null'}
    }
}
