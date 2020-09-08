package day08.demo02;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
//键盘是一个USB设备
public class Keyboard implements USB {
    public void open() {
        System.out.println("打开键盘");
    }

    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
