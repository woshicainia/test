package day08.demo04;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class MyOuter{
    public void methodOuter(){
        final int num = 10;//num的值一旦赋值就不能变
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
