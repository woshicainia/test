/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：找出1-100所有的素数  每8个换行输出
 * 素数：能够被1和自身整除，不能被其它数字整除的数字
 * 思路：判断是不是素数，就是两种结果，可以用boolean类型做一个标记，以此来输出素数
 */
public class ForTest01 {
    public static void main(String[] args) {
        int count = 0;
        int j;
        int i = 2;
        boolean isSuShu;
        for (;i < 100; i++) {
            isSuShu = true;//每次执行完都要重新赋值为真，当不是素数就变为假，剩下的就是真。
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuShu = false;
                }
            }
            if (isSuShu) {
                System.out.print(i + "\t");
                count++;
                if (count % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
