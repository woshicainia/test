/**
 * Created by wangxiaowei on 2020/8/30.
 * 加号的三种用法：
 *      1.数据相加
 *      2.字符加数字
 *      3.字符串连接符
 */
public class JiaHaoYongFa {
    public static void main(String[] args) {
        //字符串类型的变量基本使用规则
        //数据类型  变量名称 = 数据值
        String str1 = "Hello";
        System.out.println(str1);

        System.out.println(str1 + "World");

        //String + int = String
        String str2 = "java";
        System.out.println(str2 + 20);

        char i = 'a';
        System.out.println(i + 1);

        System.out.println(str2 + 20 + 30);//java2030
        System.out.println(str2 + (20 + 30));//java50
    }
}
