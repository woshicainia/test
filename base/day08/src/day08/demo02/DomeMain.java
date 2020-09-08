package day08.demo02;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class DomeMain {
    public static void main(String[] args) {
        //创建一台电脑
        PC pc = new PC();
        //打开电脑
        pc.powerOn();

        //准备一个鼠标供电脑使用
//        Mouse mouse = new Mouse();
//        USB usbMouse = mouse;
        //首先向上转型，多态写法
        USB usbMouse = new Mouse();
        //参数是USB类型，正好传进去usb鼠标类型
        pc.useUSB(usbMouse);

        //准备一个键盘供电脑使用
        Keyboard keyboard = new Keyboard();
        pc.useUSB(keyboard);//类似于自动类型转换

        //关闭电脑
        pc.powerOff();
    }
}
