/**
 * Created by wangxiaowei on 2020/8/30
 * 强制类型转换：
 *      1.特点：代码需要进行特殊的格式处理，不能自动完成。.
 */
public class QiangZhiZhuanHuan {
    public static void main(String[] args) {
        int i = (int)100L;
        System.out.println(i);
        //格式：范围小的类型 范围小的变量名 = （范围小的数据类型） 范围大的数据
    }
}
