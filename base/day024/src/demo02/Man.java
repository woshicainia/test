package demo02;

/**
 * Created by wangxiaowei on 2020/9/24.
 */
public class Man extends HuMan {
    @Override
    public void sayHello() {
        System.out.println("hello 我是man");
    }
    public void method(JieKou2 j){
        j.green();
    }
    public void show(){
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
