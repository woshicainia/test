package demo01;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class Demo03 {
    public static void main(String[] args) {
        //基本数据类型转字符串
        int num = 100;
        String s = num + "";
        System.out.println(s + 200);//100200

        String s2 = Integer.toString(100);
        System.out.println(s2);//100

        String s3 = String.valueOf(200);
        System.out.println(s3);//200

        //字符串转基本数据类型
        int i = Integer.parseInt(s3);
        System.out.println(i);//200
    }
}
