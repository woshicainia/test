package reflect;

public class Test {
    public static void main(String[] args) throws Exception{
        //获取Class文件的三种方式
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);//class reflect.Person
        Class cls2 = Person.class;
        System.out.println(cls2);//class reflect.Person
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);//class reflect.Person
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true
    }
}
