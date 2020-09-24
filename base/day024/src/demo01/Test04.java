package demo01;

import java.util.function.Consumer;
public class Test04 {
    public static void method(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        method(arr,(s)->{
            String name = s.split(",")[0];
            System.out.print("姓名是：" + name);
        },(s)->{
            String xingBie = s.split(",")[1];
            System.out.println(",性别是：" + xingBie);
        });
        /*姓名是：迪丽热巴,性别是：女
        姓名是：古力娜扎,性别是：女
        姓名是：马尔扎哈,性别是：男*/
    }
}
