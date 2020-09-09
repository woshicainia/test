package demo02;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class StudentDemoTest {
    public static void main(String[] args) {
        StudentDemo<String> stringStudentDemo = new StudentDemo<String>();
        stringStudentDemo.setName("张三");
        System.out.println(stringStudentDemo.getName());//张三
    }
}
