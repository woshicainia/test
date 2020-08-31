/**
 * Created by wangxiaowei on 2020/8/30.
 * 需求：打印九九乘法表
 * 分析问题  找规律  再写代码
 * 一定要找到规律在写代码，不然改着改着就烦了
 */
public class ForTest {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i < 10;i++){
            if (i > 1){
                System.out.println();
            }
            for (j = 1;j <= i;j++){
                System.out.print(i + "*" + j + " = " + i * j + "\t");
            }
        }
    }
}
