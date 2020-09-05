package demo02;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 定义一个标准的学生类
 */
public class Student {
    private String name;//姓名
    private int age;//年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
