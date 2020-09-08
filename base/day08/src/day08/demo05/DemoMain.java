package day08.demo05;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterfaceImpl();
//        myInterface.method();//实现类重写了接口的抽象方法
        MyInterface myInterface = new MyInterface() {
            public void method() {
                System.out.println("匿名内部类重写了接口的抽象方法A");
            }
        };
        myInterface.method();//匿名内部类重写了接口的抽象方法
        new MyInterface() {
            public void method() {
                System.out.println("匿名内部类重写了接口的抽象方法B");
            }
        }.method();
    }
}
