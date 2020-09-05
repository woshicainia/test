package demo01;

/**
 * Created by wangxiaowei on 2020/9/5.
 */
public class Student {
    //属性私有化  姓名 年龄
    private String name;
    private int age;

    //构造方法
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    public Student(String name,int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    //Getter和Setter方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
