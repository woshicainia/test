package day08.demo02;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
//鼠标是一个USB设备
public class Mouse implements USB {
    public void open() {
        System.out.println("打开鼠标");
    }

    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
