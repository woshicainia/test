package day08.demo02;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class PC {
    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void useUSB(USB usb){
        usb.open();//打开设备
        //向下转型
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
