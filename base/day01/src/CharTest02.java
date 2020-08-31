/**
 * Created by wangxiaowei on 2020/8/30.
 * \n换行符 \t制表符
 * 任务：输出\'
 */
public class CharTest02 {
    public static void main(String[] args) {
        char i = '\\';
        char j = '\'';
        char n = '\t';
        char m = '\n';
        char h = '\u4e2d';
        System.out.println(i);
        System.out.println(m);
        System.out.println(n);
        System.out.println(j);
        System.out.println(h);//中字对应的unicode编码是4d2e
    }
}
