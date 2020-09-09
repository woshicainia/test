package demo03;

/**
 * Created by wangxiaowei on 2020/9/9.
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        int i = s1.hashCode();
        int i1 = s2.hashCode();
        System.out.println(i);//96354
        System.out.println(i1);//96354
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
