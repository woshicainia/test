package demo02;

import demo01.*;

/**
 * Created by wangxiaowei on 2020/9/5.
 */
public class StudentDemo01 {
    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造方法执行
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());
        Student stu2 = new Student("古力娜拉",21);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    }
}
