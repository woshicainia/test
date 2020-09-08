package day08.demo03;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class Outer {
    int num = 10;
    public class Inner{
        int num = 20;
        public void methodInner(){
            int num = 30;
            System.out.println(num);//局部变量30
            System.out.println(this.num);//内部类成员变量20
            System.out.println(Outer.this.num);//外部类的成员变量10
        }
    }
}
