package demo02;
/**
 * Created by wangxiaowei on 2020/9/5.
 * 需求定义一个数组，存放3个person对象
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜拉",20);
        Person three = new Person("马尔扎哈",38);
        array[0] = one;//存的内存地址
        array[1] = two;//存的内存地址
        array[2] = three;//存的内存地址
        System.out.println(array[1].getName());//古力娜拉
    }
}
