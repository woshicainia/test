package demo01;

/**
 * Created by wangxiaowei on 2020/9/5.
 */
public class StudentDemo01 {
    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造方法执行了
        Student stu2 = new Student("赵丽颖",20);//全参构造方法执行了
        System.out.println(stu2.getName() + "的年龄是" + stu2.getAge());//赵丽颖的年龄是20
        stu2.setAge(21);
        System.out.println(stu2.getName() + "的年龄是" + stu2.getAge());//赵丽颖的年龄是21
    }
}
