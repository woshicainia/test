/**
 * Created by wangxiaowei on 2020/8/30.
 * char类型：底层占两个字节
 */
public class CharTest01 {
    public static void main(String[] args) {
        char i = 'a';
        //char类型只能存两个字节
        // char j = 'ab';
        char a = '中';
        //一个汉字两个字节，可以存进char类型里
        System.out.println(i);
        System.out.println(a);
    }
}
