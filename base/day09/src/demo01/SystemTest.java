package demo01;


import java.util.Arrays;
public class SystemTest {
    public static void main(String[] args) {
        demo01();
        dem02();
    }
    //将数组src{1，2，3，4，5}的前三个元素复制到desc{6,7,8,9,10}的前三个位置上
    private static void dem02() {
        int[] src = {1,2,3,4,5};
        int[] desc = {6,7,8,9,10};
        System.out.println(Arrays.toString(desc));//[6, 7, 8, 9, 10]
        System.arraycopy(src,0,desc,0,3);
        System.out.println(Arrays.toString(desc));//[1, 2, 3, 9, 10]
    }

    //计算for循环的执行时间
    private static void demo01() {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序执行的时间是" + (e-b)+"毫秒");//程序执行的时间是116毫秒
    }
}
