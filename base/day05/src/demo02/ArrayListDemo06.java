package demo02;

import java.util.ArrayList;

/**
 * Created by wangxiaowei on 2020/9/5.
 * 题目：自定义4个学生对象，添加到集合，并遍历。
 */
public class ArrayListDemo06 {
    public static void main(String[] args) {
        //创建4个学生对象
        Student stu1 = new Student("张三",17);
        Student stu2 = new Student("王五",11);
        Student stu3 = new Student("李六",22);
        Student stu4 = new Student("林冲",36);
        //创建一个装学生类的集合
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "的年龄是：" + list.get(i).getAge());
        }
    }
}
//张三的年龄是：17
//王五的年龄是：11
//李六的年龄是：22
//林冲的年龄是：36