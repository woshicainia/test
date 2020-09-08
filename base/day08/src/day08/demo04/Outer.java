package day08.demo04;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class Outer {//外部类
    public void methodOuter(){//外部类成员方法
        class Inner{//局部内部类
            int num = 10;//局部内部类成员变量
            public void methodInner(){//局部内部类成员方法
                System.out.println(num);//10
            }
        }
        Inner inner = new Inner();//创建局部内部类对象
        inner.methodInner();//通过局部内部类对象去访问局部内部类的成员方法。
    }
}
